package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String surgeryType;
    private float surgeryTime;

    public float getSurgeryTime() {
        return surgeryTime;
    }

    public String getSurgeryType() {
        return surgeryType;
    }
}