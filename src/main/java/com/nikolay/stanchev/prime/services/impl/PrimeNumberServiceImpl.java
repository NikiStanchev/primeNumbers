package com.nikolay.stanchev.prime.services.impl;

import com.nikolay.stanchev.prime.services.PrimeNumberService;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

@Service
public class PrimeNumberServiceImpl implements PrimeNumberService {
    @Override
    public String isPrimeNumber(Long number) {
//        boolean flag = false;
//        for(int i = 2; i <= number / 2; ++i)
//        {
//            // condition for nonprime number
//            if(number % i == 0)
//            {
//                flag = true;
//                break;
//            }
//        }

        if (isPrime(number)){
            return number + " is a prime number.";
        } else {
            return number + " is not a prime number.";
        }
    }

    @Override
    public String nextPrimeNumber(Long number) {
        String message = "Next prime number is: ";
        // Base case
        if (number <= 1){
            return message + 2L;
        }

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
        return message + prime;
    }

    private  boolean isPrime(final Long number) {
        return number > 1 && LongStream.range(2, number).noneMatch(index -> number % index == 0);
    }
}
