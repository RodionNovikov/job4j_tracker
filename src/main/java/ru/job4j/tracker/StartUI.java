package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item time = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        LocalDateTime localTime = time.getLocalDateTime();
        String currentDateTime = localTime.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTime);

    }
}