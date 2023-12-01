package meu.booking.controller;

import meu.booking.dto.PassangerDto;
import meu.booking.model.PassangerModel;
import meu.booking.repository.passangerRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("api/v1/passanger")
public class PassangerController {
    @Autowired
    private passangerRepositiory repositiory;
    @PostMapping("")
    public ResponseEntity<?>createNewPassanger(@RequestBody PassangerModel passanger){
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(currentDate);
        try{
            passanger.setTime(Timestamp.valueOf(formattedDate));
            repositiory.save(passanger);
        }   catch (RuntimeException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        PassangerModel passangerModel = repositiory.findByTime(Timestamp.valueOf(formattedDate));
        return new ResponseEntity<>(passangerModel.getId(), HttpStatus.CREATED);
    }
}
