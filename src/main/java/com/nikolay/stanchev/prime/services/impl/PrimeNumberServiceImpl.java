package com.nikolay.stanchev.prime.services.impl;

import com.nikolay.stanchev.prime.models.PrimeNumber;
import com.nikolay.stanchev.prime.services.PrimeNumberService;
import org.springframework.stereotype.Service;

import java.util.stream.LongStream;

@Service
public class PrimeNumberServiceImpl implements PrimeNumberService {
    @Override
    public PrimeNumber isPrimeNumber(Long number) {
        if (isPrime(number)){
            return new PrimeNumber(number, "Is a prime number!");
        } else {
            return new PrimeNumber(number, "Is not a prime number!");
        }
    }

    @Override
    public PrimeNumber nextPrimeNumber(Long number) {
        String message = String.format("Is the next primer number after %d.", number);

        Long prime = number;
        boolean found = false;

        // Loop continuously until isPrime returns
        // true for a number greater than n
        while (!found)
        {
            prime++;
            if (isPrime(prime)){

                found = true;
            }
        }
        return new PrimeNumber(prime, message);
    }

    private  boolean isPrime(final Long number) {
        return number > 1 && LongStream.range(2, number).noneMatch(index -> number % index == 0);
    }
}
