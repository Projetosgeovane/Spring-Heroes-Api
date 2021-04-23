package com.digitalinnovationone.heroesapi;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDynamoDBRepositories
@RestController
public class HeroesapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroesapiApplication.class, args);
		System.out.println("Parabéns, a aplicação funcionou com sucesso !!!");
	}

}
