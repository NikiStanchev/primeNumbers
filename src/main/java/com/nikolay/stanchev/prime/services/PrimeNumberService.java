package com.nikolay.stanchev.prime.services;

import com.nikolay.stanchev.prime.models.PrimeNumber;

public interface PrimeNumberService {

    PrimeNumber isPrimeNumber(Long number);

    PrimeNumber nextPrimeNumber(Long number);
}
