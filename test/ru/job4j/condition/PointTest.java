package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculate.X2;
import ru.job4j.calculator.Fit;

public class PointTest {

    @Test
    public void whenX2Two() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double expected = 2.0;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenX1Y2Two() {
        int x1 = 2;
        int x2 = 0;
        int y1 = 0;
        int y2 = 2;
        double expected = 2.8;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenX1Y1Two() {
        int x1 = 2;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = 0.0;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenX1Y1X2Y2Two() {
        int x1 = 2;
        int x2 = 2;
        int y1 = 2;
        int y2 = 2;
        double expected = 0.0;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.1);
    }
}