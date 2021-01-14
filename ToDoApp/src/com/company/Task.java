package com.company;

import java.util.*;


public class Task {

    private static Scanner in = new Scanner(System.in);

    public enum NotificationType {
        vibration,
        sound,
        vibrationAndSound
    }
    private final String name;
    private boolean finished;
    private String dueDate;
    private String dueTime;
    private String repeat;
    private String notificationType;
    private Map<Label, String> labels;

    public Task(String name, String dueDate, String dueTime, String repeat, NotificationType notificationType) {
        this.name = name;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
        this.repeat = repeat;
        this.labels = new TreeMap<>();
        switch (notificationType) {
            case sound:
                this.notificationType = "Sound only";
                break;
            case vibration:
                this.notificationType = "Vibration only";
                break;
            case vibrationAndSound:
                this.notificationType = "Vibration and sound";
                break;
        }
    }

    public void addLabel(String name, String description) {

        if (labels.containsKey(new Label(name, -1))) {

            System.out.println("There is already a label with the name " + name);
        } else {
            System.out.println("Label created");
            labels.put(new Label(name),description);
        }

        // TODO: 12.1.2021 г. make it so the validation is first / then add the description with a scanner
    }

    public void removeLabel(String name) {

        Label label = new Label(name, -1);

        if (labels.containsKey(label)) {
            labels.remove(label);
        } else {

            System.out.println("There isn't a label named " + name);
        }
    }

    public void showLabels(){
        int counter = 1;
        for (Label label : labels.keySet()) {
            System.out.println(counter + ". " + label.toString() + "\nDescription: " + labels.get(label) + "\n");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isFinished() {
        return finished;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getDueTime() {
        return dueTime;
    }

    public String getRepeat() {
        return repeat;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public Map<Label, String> getLabels() {
        return Collections.unmodifiableMap(labels);
    }




}
