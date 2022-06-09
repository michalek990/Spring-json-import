package com.example.demo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.domain.Animals;
import com.example.demo.service.AnimalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class JsontodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsontodbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(AnimalService animalService){
		return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Animals>> typeReference = new TypeReference<List<Animals>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/data.json");
			try {
				List<Animals> animals = mapper.readValue(inputStream,typeReference);
				animalService.save(animals);
				System.out.println("Hunted animals saved!");
			} catch (IOException e){
				System.out.println("Unable to save hunted animals :/ " + e.getMessage());
			}
		};
	}
}
