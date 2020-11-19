package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String dentMachineType;
    private int teethDone;

    public int getToothDone() {
        return teethDone;
    }

    public String getDentMachineType() {
        return dentMachineType;
    }
}