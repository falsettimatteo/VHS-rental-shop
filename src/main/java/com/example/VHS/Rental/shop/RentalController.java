package com.example.VHS.Rental.shop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rental")
@Slf4j
public class RentalController {

    @Autowired
    private RentalService rentalService;


    @RequestMapping(value = "/insert",consumes = "application/json",method = RequestMethod.POST)
    public String insertRental(@RequestBody Rental rental){
        rentalService.addRental(rental);
        return("Added Rental successfully");
    }
}
