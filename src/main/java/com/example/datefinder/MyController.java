package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    @GetMapping
    public String reqDate(){
        LocalDate today=LocalDate.now();
        LocalDate dt=today.plusDays(100);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String req_date=dt.format(f);
        return req_date;
    }
    
}
