package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenP8K3() {
        int p = 8;
        int k = 3;
        double expected = 3.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenP9K3() {
        int p = 9;
        int k = 3;
        double expected = 3.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenP10K5() {
        int p = 12;
        int k = 5;
        double expected = 5.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }
}