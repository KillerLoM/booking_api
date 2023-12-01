package meu.booking.controller;

import meu.booking.model.DepartureModel;
import meu.booking.model.DestinationModel;
import meu.booking.repository.departureRepository;
import meu.booking.repository.destinationRepository;
import meu.booking.service.StringHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/destination")
public class DestinationController {
    @Autowired
    private destinationRepository destinationRepository;
    @Autowired
    private StringHandle stringHandle;
    @PostMapping("")
    public ResponseEntity<String> createDestination(@RequestBody DestinationModel destination){
        try{
            String check = destination.getName();
            check = check.toLowerCase().replace(" ", "-");
            String nameplug = stringHandle.removeAccents(check);
            destination.setNameplug(nameplug);
            destinationRepository.save(destination);
        }catch (RuntimeException e){
            return  new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
