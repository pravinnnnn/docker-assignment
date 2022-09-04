package tech.divij.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ConsumerApplication {

@Bean
WebClient.Builder getBuilder(){
	return WebClient.builder();
}

@Bean
RestTemplate getRestTemplate(){

	return new RestTemplate();
}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}
