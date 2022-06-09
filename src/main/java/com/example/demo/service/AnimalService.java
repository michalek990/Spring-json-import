package com.example.demo.service;

import com.example.demo.domain.Animals;
import com.example.demo.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Iterable<Animals> list() {
        return animalRepository.findAll();
    }

    public Animals save(Animals hunted_animal) {
        return animalRepository.save(hunted_animal);
    }

    public void save(List<Animals> hunted_animals) {
        animalRepository.saveAll(hunted_animals);
    }
}
