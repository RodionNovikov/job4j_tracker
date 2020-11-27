package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class LicenceTest {

    @Test
    public void testEquals0() {
        Licence first = new Licence();
        first.setCode("audio");
        Licence second = new Licence();
        second.setCode("audio");
        assertThat(first, is(second));

    }

    @Test
    public void testNotEquals() {
        Licence first = new Licence();
        first.setOwner("Olga Petrova");
        Licence second = new Licence();
        second.setCode("Nina Petrova");
        assertThat(first, not(second));
    }
}