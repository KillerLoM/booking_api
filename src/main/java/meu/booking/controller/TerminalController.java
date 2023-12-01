package meu.booking.controller;

import meu.booking.model.TerminalModel;
import meu.booking.repository.terminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/booking")
public class TerminalController {
    @Autowired
    private terminalRepository terminalRepository;
    @PostMapping("")
    public ResponseEntity<String> createTerminal(@RequestBody TerminalModel terminal){
        try{
            terminalRepository.save(terminal);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("OK", HttpStatus.OK);


    }
}
