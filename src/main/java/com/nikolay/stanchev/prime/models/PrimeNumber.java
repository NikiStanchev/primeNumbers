package com.nikolay.stanchev.prime.models;

public class PrimeNumber {
    Long number;
    String message;

    public PrimeNumber(Long number, String message) {
        this.number = number;
        this.message = message;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
