package com.nikolay.stanchev.prime;

import com.nikolay.stanchev.prime.models.PrimeNumber;
import com.nikolay.stanchev.prime.services.impl.PrimeNumberServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PrimeNumbersApplication.class)
@WebAppConfiguration
class PrimeNumbersApplicationTests {

    @Autowired
    PrimeNumberServiceImpl primeNumberService;

    @Test
    void isPrimeNumber_19_true() {
        Long number = 19L;

        PrimeNumber primeNumber = new PrimeNumber(number, "Is a prime number!");
        PrimeNumber result = primeNumberService.isPrimeNumber(number);

        assertEquals(primeNumber.getNumber(), result.getNumber());
        assertEquals(primeNumber.getMessage(), result.getMessage());
    }

    @Test
    void isPrimeNumber_18_false() {
        Long number = 18L;

        PrimeNumber primeNumber = new PrimeNumber(number, "Is not a prime number!");
        PrimeNumber result = primeNumberService.isPrimeNumber(number);

        assertEquals(primeNumber.getNumber(), result.getNumber());
        assertEquals(primeNumber.getMessage(), result.getMessage());
    }

    @Test
    void nextPrimeNumber_18_19() {
        Long number = 18L;

        PrimeNumber primeNumber = new PrimeNumber(19L, String.format("Is the next primer number after %d.", number));
        PrimeNumber result = primeNumberService.nextPrimeNumber(number);

        assertEquals(primeNumber.getNumber(), result.getNumber());
        assertEquals(primeNumber.getMessage(), result.getMessage());
    }

    @Test
    void nextPrimeNumber_minus2_2() {
        Long number = -2L;

        PrimeNumber primeNumber = new PrimeNumber(2L, String.format("Is the next primer number after %d.", number));
        PrimeNumber result = primeNumberService.nextPrimeNumber(number);

        assertEquals(primeNumber.getNumber(), result.getNumber());
        assertEquals(primeNumber.getMessage(), result.getMessage());
    }
}
