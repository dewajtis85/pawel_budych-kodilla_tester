package com.kodilla.stream.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {


    public static List<Task> getTasks(){

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("kurs kodilli", LocalDate.of(2019, 11, 20), LocalDate.of(2021, 6,2)));
        tasks.add(new Task("podpisanie umowy", LocalDate.of(2019, 5,14), LocalDate.of(2021,9,12)));
        tasks.add(new Task("zakup samochodu", LocalDate.of(2021,6,1), LocalDate.of(2021, 12, 31)));
        tasks.add(new Task("sprzedaż motocykla", LocalDate.of(2021, 5,5), LocalDate.of(2022, 6, 6)));
        tasks.add(new Task("budowa garażu", LocalDate.of(2021, 3, 1), LocalDate.of(2021, 10,10)));


        return tasks;
    }


}
