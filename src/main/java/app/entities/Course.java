package app.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity

public class Course extends Student{

    private String course;
    private String teacher;
    private int semester;
    private String classRoom;
    private LocalTime time;


}
