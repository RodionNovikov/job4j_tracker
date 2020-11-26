package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LicenceTest {

    @Test
    public void testEquals() {
        Licence first = new Licence();
        first.setCode("audio");
        Licence second = new Licence();
        second.setCode("audio");
        assertThat(first, is(second));

    }
}