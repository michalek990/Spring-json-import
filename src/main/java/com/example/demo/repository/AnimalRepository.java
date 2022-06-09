package com.example.demo.repository;

import com.example.demo.domain.Animals;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animals, Long> {

}
