package tech.divij.Consumer.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ConsumerService {


    @Autowired
    RestTemplate restTemplate;

    @Value("${producer.service.url}")
    String producerServiceUrl;

    public String getData(){

System.out.println("service url; "+producerServiceUrl);
    return restTemplate.getForObject(producerServiceUrl+"/data", String.class );


    }
}
