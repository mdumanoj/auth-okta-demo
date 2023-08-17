package com.example.auth.okta.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/simple")
public class SimpleController {

    @GetMapping("/public")
    public ResponseEntity<String> pingPublic() {
        log.debug("Public API called !");
        return new ResponseEntity<>("Public Pong", HttpStatus.OK);
    }

    @GetMapping("/private")
    public ResponseEntity<String> pingPrivate() {
        log.debug("Private API called !");
        return new ResponseEntity<>("Private Pong", HttpStatus.OK);
    }
}
