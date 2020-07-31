package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTwoToTwentyThenOneHundredAndTen() {
        int rsl = Counter.sumByEven(2, 20);
        int expected = 110;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumFromOneToTenThenThirty() {
        int rsl = Counter.sum(1, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }
}