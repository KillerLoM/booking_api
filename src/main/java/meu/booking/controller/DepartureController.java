package meu.booking.controller;

import meu.booking.model.DepartureModel;
import meu.booking.repository.departureRepository;
import meu.booking.service.StringHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/departure")
public class DepartureController {
    @Autowired
    private departureRepository departureRepository;
    @Autowired
    private StringHandle stringHandle;
    @PostMapping("")
    public ResponseEntity<String>createDeparture(@RequestBody DepartureModel departure){
        try{
            String check = departure.getName();
            check = check.toLowerCase().replace(" ", "-");
            String nameplug = stringHandle.removeAccents(check);
            departure.setNameplug(nameplug);
            departureRepository.save(departure);
        }catch (RuntimeException e){
            return  new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
