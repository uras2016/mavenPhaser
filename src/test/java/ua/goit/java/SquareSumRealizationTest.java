package ua.goit.java;

import org.junit.Assert;
import org.junit.Test;

public class SquareSumRealizationTest {
    SquareSumRealization square = new SquareSumRealization();

    @Test
    public void testGetSquareSumFirst() throws Exception {
    int[] value = {1,2,3,4,5,6,7,8,9,10};
        Long res = square.getSquareSum(value, 5);
        Assert.assertEquals(385, res, 0);
    }

    @Test
    public void testGetSquareSumSecond() throws Exception {
        int[] value = {10};
        Long res = square.getSquareSum(value, 4);
        Assert.assertEquals(100, res, 0);
    }

    @Test
    public void testGetSquareSumThird() throws Exception {
        int[] value = {};
        Long res = square.getSquareSum(value, 4);
        Assert.assertEquals(0, res, 0);
    }

    @Test
    public void testGetSquareSumFourth() throws Exception {
        int[] value = {0, -100, -5};
        Long res = square.getSquareSum(value, 4);
        Assert.assertEquals(10025, res, 0);
    }
}