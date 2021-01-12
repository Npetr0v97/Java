package com.company;

public class Main {

    public static void main(String[] args) {

        Task testTask = new Task("Work","2021-01-01","12:00","No repeat", Task.NotificationType.vibrationAndSound);

        testTask.addLabel("Work","All tasks regarding work");
        testTask.addLabel("Personal","All tasks regarding work");
        testTask.addLabel("Fiverr","All tasks regarding work");
        testTask.addLabel("Econt","All tasks regarding work");
        testTask.addLabel("Personal","All tasks regarding work");
        System.out.println();
        testTask.showLabels();

        // TODO: 11.1.2021 г. Main menu
    }
}
