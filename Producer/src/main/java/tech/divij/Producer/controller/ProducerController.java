package tech.divij.Producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {


    @GetMapping("data")
    public String getData(){
        System.out.println("inside getData()");
        return "Hello World! I am Producer";
    }





}
