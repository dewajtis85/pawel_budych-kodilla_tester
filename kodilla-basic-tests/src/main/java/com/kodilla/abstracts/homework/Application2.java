package com.kodilla.abstracts.homework;

public class Application2 {


    public static void main(String[] args) {
        Person artur = new Person("Artur", 28, new Firefighter());
        Person darek = new Person("Darek", 35, new Policeman());
        Person justyna = new Person("Justyna", 40, new Doctor());
        Person andrzej = new Person("Andrzej", 25, new Farmer());

        artur.getJob();
        Job arturJob = artur.getJob();
        System.out.println(arturJob.getResponsibilities());

        darek.getJob();
        Job darekJob = darek.getJob();
        System.out.println(darekJob.getResponsibilities());

        justyna.getJob();
        Job justynaJob = justyna.getJob();
        System.out.println(justynaJob.getResponsibilities());

        andrzej.getJob();
        Job andrzejJob = andrzej.getJob();
        System.out.println(andrzejJob.getResponsibilities());

    }
}




