package app.entities;

import app.config.HibernateConfig;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class PersonDAO {

    private EntityManagerFactory emf;

    public PersonDAO(EntityManagerFactory emf){
        this.emf = emf;
    }


public void create (Person person){
    try(EntityManager em = emf.createEntityManager()){
        em.getTransaction().begin();//giver den et punkt til at kunne rollback "Back up"
        em.persist(person);//Gemmer i databasen
        em.getTransaction().commit(); // Skriver det ned til databasen.
        //Persist fortæller hvad den skal gøre i database og commit udfører handlingen.

    }





}



}
