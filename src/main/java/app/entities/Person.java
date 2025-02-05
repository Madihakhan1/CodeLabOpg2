package app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder

public class Person {

    @Id //Dette betyder at id --> primary key, den måde vi genere id'et på er som denne identity, vi bruger progres interne måde at sætte det op på.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GeneationType.IDENTITY genere et nyt unikt id.
    private int id;
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }




}
