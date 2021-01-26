package com.company;

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

        //TODO: add mail validator before account creation - check for "@"

        Account nikolay = new Account("petr0v97","rd971804","nikolay.petrov.petrov.97@gmail.com", Account.TimeFormat.twentyFourHour,true);
        System.out.println(nikolay);

        nikolay.addTask("Homework");
        System.out.println(nikolay.getTasks().get(0));
        // TODO: 11.1.2021 г. Main menu
    }
}
