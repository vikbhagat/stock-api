package com.example.eb2bpublicstockapi.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class QuantityService {
    public String getquantity(String itemNumber) {
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);

        return String.valueOf(int_random);
    }
}
