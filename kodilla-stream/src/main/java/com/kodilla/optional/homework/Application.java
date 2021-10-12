package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Budych", new Teacher("Malinowski")));
        students.add(new Student("Cichy", new Teacher("Przybyła")));
        students.add(new Student("Smolarek", null));
        students.add(new Student("Janusz", new Teacher("Adamczak")));
        students.add(new Student("Pokorska", null));


        for (Student student : students){

            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String Teacher =
                    optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Uczeń: " + student.getName() + ", Nauczyciel: " + (Teacher));


        }

    }
}
