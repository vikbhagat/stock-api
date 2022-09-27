package com.example.eb2bpublicstockapi.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class QuantityService {
    public String getQuantity(String itemNumber) {
        Random rand = new Random();
        int upperbound = 25;
        int int_random = rand.nextInt(upperbound);
        return String.valueOf(int_random);
    }
}
