package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {

        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isBefore(LocalDate.now()))
                .map(TaskManager::getTaskDate)
                .collect(Collectors.toList());
        System.out.println(deadlines);

    }

    public static LocalDate getTaskDate(Task task) {
        return task.getDeadline();
    }

}


