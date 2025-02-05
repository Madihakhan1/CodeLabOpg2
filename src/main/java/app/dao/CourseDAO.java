package app.dao;

import app.entities.Course;
import app.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class CourseDAO {

    private EntityManagerFactory emf;

    public CourseDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }


    public void create(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();//giver den et punkt til at kunne rollback "Back up"
            em.persist(course);//Gemmer i databasen
            em.getTransaction().commit(); // Skriver det ned til databasen.
            //Persist fortæller hvad den skal gøre i database og commit udfører handlingen.

        }
    }

}
