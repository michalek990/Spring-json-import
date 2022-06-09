package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public class Animals {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String nazwa;
    private String zwierzeta_lowne;
    private Integer rok;
    private Float ilosc;
    private Float wartosc;


    public Animals() {}
}
