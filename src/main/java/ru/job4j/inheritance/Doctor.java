package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String hospitalName;
    private int patientsPerDay;

    public String getHospitalName(){
        return hospitalName;
    }

    public int getPatientsPerDay() {
        return patientsPerDay;
    }
}
