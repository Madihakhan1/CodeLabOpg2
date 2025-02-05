package app;


import app.config.HibernateConfig;
import app.dao.CourseDAO;
import app.dao.StudentDAO;
import app.entities.Course;
import app.entities.Person;
import app.dao.PersonDAO;
import app.entities.Student;
import jakarta.persistence.EntityManagerFactory;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();//Min connection pool der holder styr på alle forbindelserne.

        PersonDAO personDAO = new PersonDAO(emf); // emf --> depency injektion
        StudentDAO studentDAO = new StudentDAO(emf);
        CourseDAO courseDAO = new CourseDAO(emf);


        Person person = Person.builder()
                .name("Madiha")
                .age(26)
                .build();
        personDAO.create(person);

        Student student = Student.builder()
                .name("Ingrid")
                .age(26)
                .phoNumber(29202020)
                .email("student@mail.com")
                .address("Nørregade 12")
                .status("Aktiv")
                .dateOfBirth(LocalDate.of(2000, 12, 12))
                .dateOfEnrollment(LocalDate.of(2024, 6, 20))
                .build();
        studentDAO.create(student);

        Course course = Course.builder()
                .course("Datamatiker")
                .teacher("Jon")
                .semester(3)
                .classRoom("D5")
                .time(LocalTime.of(3, 5))
                .build();
        courseDAO.create(course);

        if (student != null) {
            student.setAddress("Landlystvej 26");
            studentDAO.updateStudent(student);
        }

        System.out.println("Database operations completed successfully.");
    }
    }
