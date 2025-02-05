package app.entities;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity


public class Student extends Person{
    private int phoNumber;
    private String email;
    private String address;
    private String status;
    private LocalDate dateOfBirth;
    private LocalDate dateOfEnrollment;


    public Student(String name, int age, int phoNumber, String email, String address, String status, LocalDate dateOfBirth, LocalDate dateOfEnrollment)
    {
        super(name, age);
        this.phoNumber = phoNumber;
        this.email = email;
        this.address = address;
        this.status = status;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEnrollment = dateOfEnrollment;
    }
}
