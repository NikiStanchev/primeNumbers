package com.nikolay.stanchev.prime.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/prime-number")
public interface PrimeNumberController {

    @RequestMapping(path = "current/{number}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity isCurrentNumberPrime(
            @PathVariable Long number
    );

    @RequestMapping(path = "next/{number}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity calculateNextPrimerNumber(
            @PathVariable Long number
    );
}
