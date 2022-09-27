package com.example.eb2bpublicstockapi.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ToolService {
    public boolean getStatus() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
