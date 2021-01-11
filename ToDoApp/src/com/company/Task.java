package com.company;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class Task {



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
        this.labels = new LinkedHashMap<>();
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
