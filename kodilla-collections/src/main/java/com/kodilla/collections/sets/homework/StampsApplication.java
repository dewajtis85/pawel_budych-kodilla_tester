package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

    Set<Stamp> stamps = new HashSet<>();
    stamps.add(new Stamp("Ferrari", 1.5, 0.9, true));
    stamps.add(new Stamp("Warsaw", 2.2, 1.6,false));
    stamps.add(new Stamp("Cracow", 2.2, 1.6, true));
    stamps.add(new Stamp("Porsche", 1.5, 0.9, false));
    stamps.add(new Stamp("Audi", 1.5, 0.9,true));
    stamps.add(new Stamp("Ferrari", 1.5, 0.9, true));
    stamps.add(new Stamp("Warsaw", 2.2, 1.6,false));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps)
            System.out.println(stamp);


    }
}
