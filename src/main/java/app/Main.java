package app;


import app.config.HibernateConfig;
import app.entities.Person;
import app.entities.PersonDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

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


    }
}