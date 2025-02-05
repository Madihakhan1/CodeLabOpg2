package app.dao;


import app.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;


public class StudentDAO {

    private EntityManagerFactory emf;

    public StudentDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void create(Student student) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();  //giver den et punkt til at kunne rollback "Back up"
            em.persist(student);          //Gemmer i databasen
            em.getTransaction().commit(); // Skriver det ned til databasen.
            //Persist fortæller hvad den skal gøre i database og commit udfører handlingen.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close(); // Close the EntityManager
        }
    }

    public  void updateStudent(Student student){
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(student); //Opdatere databasen
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close(); //Luk EntityManager
        }
    }
}
