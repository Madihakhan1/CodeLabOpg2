package app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Person {

    @Id //Dette betyder at id --> primary key, den måde vi genere id'et på er som denne identity, vi bruger progres interne måde at sætte det op på.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GeneationType.IDENTITY genere et nyt unikt id.
    private int id;
    private String name;
    private int age;

    public Person (int age, String name){
        this.age = age;
        this.name = name;

    }

}
