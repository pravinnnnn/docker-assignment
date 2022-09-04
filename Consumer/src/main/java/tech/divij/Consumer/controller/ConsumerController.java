package tech.divij.Consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import tech.divij.Consumer.controller.service.ConsumerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("consume")
    public List<String> getObject(){

        String consumerString = "I am Consumer";
        String producerString = consumerService.getData();



        return Arrays.asList(new String[]{consumerString, producerString});

    }


}
