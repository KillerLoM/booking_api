package meu.booking.controller;

import meu.booking.model.Bus29S;
import meu.booking.model.PassangerModel;
import meu.booking.repository.bus29sRepository;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@Controller
@RequestMapping("api/v1/bus29s")
public class Bus29sController {
    @Autowired
    private bus29sRepository repo;
    @PostMapping("")
    public ResponseEntity<?> initLine(){
        try{
            Bus29S bus29S = new Bus29S();
            repo.save(bus29S);
        }catch (RuntimeException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("OK", HttpStatus.CREATED);
    }
    @GetMapping("")
    public ResponseEntity<?> getPassanger(@RequestParam UUID id){
        try{
            return new ResponseEntity<>(repo.findBus29SById(id), HttpStatus.CREATED);
        }catch (RuntimeException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
//    @PutMapping("")
//    public ResponseEntity<?> addPassanger(@RequestParam UUID id,
//                                          @RequestBody Bus29S bus29S){
//        try{
//            Bus29S bus29s = repo.fi
//            return new ResponseEntity<>(repo.findAll(), HttpStatus.CREATED);
//        }catch (RuntimeException e){
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//    }
}
