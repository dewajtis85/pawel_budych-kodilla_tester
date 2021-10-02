package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> students = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, int... students) {
        this.schoolName = schoolName;
        for (int student : students)
            this.students.add(student);

    }

    public String getSchoolName() {
        return schoolName;

    }
    public int getSumOfStudents() {
        int sum = 0;
        for (int student : students)
            sum += student;
            return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
