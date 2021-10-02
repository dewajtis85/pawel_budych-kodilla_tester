package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> liceum = new HashMap<>();

        Principal wachowska = new Principal("Stefania", "Wachowska");
        Principal waligora = new Principal("Maria", "Waligóra");
        Principal cicha = new Principal("Patrycja", "Cicha");
        Principal janusz = new Principal("Maria", "Janusz");
        Principal przybyla = new Principal("Teresa", "Przybyła");

        School pierwszeLiceum = new School(   "pierwszego liceum ogólnowształcącego", 20, 30, 25, 29, 30, 19, 18);
        School drugieLiceum = new School("drugiego liceum ogólnokształcącego", 20, 30, 20, 30, 20);
        School trzecieLiceum = new School("trzeciego liceum ogólnokształcącego", 19, 20, 31, 18, 25, 25, 25);
        School czwarteLiceum = new School("czwartego liceum ogólnokształcącego", 21, 22, 23, 29, 28, 27, 26);
        School piateLiceum = new School("piątego liceum ogólnokształcącego", 30, 31, 29, 17, 25, 26, 28);

        liceum.put(wachowska, pierwszeLiceum);
        liceum.put(waligora, drugieLiceum);
        liceum.put(cicha, trzecieLiceum);
        liceum.put(janusz, czwarteLiceum);
        liceum.put(przybyla, piateLiceum);


        for (Map.Entry<Principal, School> result : liceum.entrySet()) {
            System.out.println(result.getKey().getFirstName() + " " + result.getKey().getLastName() + " jest dyrektorką " + result.getValue().getSchoolName() +
                    " do którego uczęszcza " + result.getValue().getSumOfStudents() + " uczniów.");

    }
}
}
