package com.javarush.task.task17.task1710;

public enum Sex {
    MALE("м"),
    FEMALE("ж");

    private final String gender;

    Sex (String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
