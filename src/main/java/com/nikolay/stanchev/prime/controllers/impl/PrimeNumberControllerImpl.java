package com.nikolay.stanchev.prime.controllers.impl;

import com.nikolay.stanchev.prime.controllers.PrimeNumberController;
import com.nikolay.stanchev.prime.services.impl.PrimeNumberServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumberControllerImpl implements PrimeNumberController {

    private final PrimeNumberServiceImpl primeNumberService;

    public PrimeNumberControllerImpl(PrimeNumberServiceImpl primeNumberService) {
        this.primeNumberService = primeNumberService;
    }


    @Override
    public ResponseEntity isCurrentNumberPrime(Long number) {
        return ResponseEntity.ok(primeNumberService.isPrimeNumber(number));
    }

    @Override
    public ResponseEntity calculateNextPrimerNumber(Long number) {
        return ResponseEntity.ok(primeNumberService.nextPrimeNumber(number));
    }
}
