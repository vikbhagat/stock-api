package com.example.eb2bpublicstockapi.service;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@Component
public class DataSpoofingService {

    private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Random randDateMod = new Random();

    public String getSpoofDateResponse(){

        Date currentDate = new Date();

        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

        c.add(Calendar.DATE, randDateMod.nextInt(50));

        // convert calendar to date
        Date currentDatePlusOne = c.getTime();

        return dateFormat.format(currentDatePlusOne);
    }
}
