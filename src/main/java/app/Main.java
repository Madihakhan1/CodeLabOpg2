package app;


import app.config.HibernateConfig;
import app.entities.Person;
import app.entities.PersonDAO;
import app.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();//Min connection pool der holder styr på alle forbindelserne.

        PersonDAO personDAO = new PersonDAO(emf); // emf --> depency injektion

        Person person = Person.builder() //Kalder min person konstruktor, så den opretter en konstruktor med de værdier jeg giver med
                .name("Madiha")
                .age(26)
                .build();
        personDAO.create(person);

        Student student = Student.builder()
                .name("Ingrid")
                .age(26)
                .phoNumber(29202020)
                .email("Studen@mail.com")
                .address("Nørregade 12")
                .status("Aktiv")
                .dateOfBirth(LocalDate.of(2000,12,12))
                .dateOfEnrollment(LocalDate.of(2024,6,20))
                .build();
        personDAO.create(student);



    }

}