package com.nikolay.stanchev.prime.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "/prime-number")
@RequestMapping("/prime-number")
public interface PrimeNumberController {

    @ApiOperation(
            value = "Make a GET request to check if number is prime number",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "current/{number}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity isCurrentNumberPrime(
            @ApiParam(name = "number", value = "Check the number if it is a prime", example = "0")
            @PathVariable Long number
    );

    @ApiOperation(
            value = "Make a GET request to find next prime number",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "next/{number}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity calculateNextPrimerNumber(
            @ApiParam(name = "number", value = "Find next prime number", example = "0")
            @PathVariable Long number
    );
}
