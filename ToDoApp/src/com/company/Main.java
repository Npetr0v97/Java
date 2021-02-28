package com.company;

import java.awt.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

/*        Task testTask = new Task("Work","2021-01-01","12:00","No repeat", Task.NotificationType.vibrationAndSound);

        testTask.addLabel("Work");
        testTask.addLabel("Personal");
        testTask.addLabel("Fiverr");
        testTask.addLabel("Econt");
        testTask.addLabel("Personal");
        System.out.println();
        testTask.showLabels();
        testTask.removeLabel("Econt");
        testTask.removeLabel("Econt");
        testTask.showLabels();*/


/*
        Account nikolay = new Account("petrov");
        System.out.println(nikolay);

     nikolay.addTask("Homework");
        nikolay.addTask("School");
        nikolay.addTask("Home work");



        nikolay.searchTask("home");*/

        ToDoApp.accounts.add(new Account("petrov_n@econt.com","123"));
        ToDoApp.accounts.add(new Account("petrov@econt.com","123"));
     //   ToDoApp.accounts.add(new Account("petrov1@econt.com","123"));
        ToDoApp.accounts.add(new Account("petrov2@econt.com","123"));
        ToDoApp.accounts.add(new Account("d_peev@econt.com","123"));
        ToDoApp.accounts.add(new Account("randomuser@econt.com","123"));
        Collections.sort(ToDoApp.accounts);

        ToDoApp.mainMenu();
    }
}