package com.example.VHS.Rental.shop;

import lombok.extern.slf4j.Slf4j;
import org.jboss.jandex.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


@RestController
@RequestMapping("/api/vhs")
@Slf4j
public class VhsController {

    @Value("${value.message}")
    private String valueMessage;

    @Autowired
    private VHSService vhsService;

    @Autowired
    private WebClient.Builder webClientBuilder;


    @RequestMapping("/all")
    public List<VHS> returnAll() {
        return vhsService.getAllVhs();
    }


    @RequestMapping( value = "/insert",consumes = "application/json",method = RequestMethod.POST) //problem insertion of 2 movie with same name
    public String insert(@RequestBody VHS vhs){
        //problem insertion of 2 movie with same name
            vhsService.addVhs(vhs);
            log.info("User ok");
            return("User succesfully added");
    }

    @RequestMapping("/valueAnnotationMessage")
    public String valueAnnotation(){
        log.info(valueMessage);
        return "Control the console messages";

    }

}

