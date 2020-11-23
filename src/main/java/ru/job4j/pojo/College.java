package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivan Popkov");
        student.setGroup("189 - 482b");
        student.setDateOfEntry(new Date());

        System.out.println(student.getFullName() + "his group  " + student.getGroup() + " date of entry " + student.getDateOfEntry());

    }
}
