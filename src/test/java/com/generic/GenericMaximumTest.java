package com.generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericMaximumTest {
    GenericMaximum maximum = new GenericMaximum();

    @Test
    public void givenfirstnum_shouldReturnMax() {
        Integer max = maximum.number(3,2,1);
        Assert.assertEquals((Integer)3, max);
    }

    @Test
    public void givenSecondnum_shouldReturnMax() {
        Integer max = maximum.number(2, 3, 1);
        Assert.assertEquals((Integer)3, max);
    }

    @Test
    public void givenThirdnum_shouldReturnMax() {
        Integer max = maximum.number(1, 2, 3);
        Assert.assertEquals((Integer)3, max);
    }

    public void givenFirstFloatNum_shouldReturnMax() {
        Float max = maximum.number(3.5f,2.5f,1.5f);
        Assert.assertEquals((Float) 3.5f, max);
    }

    @Test
    public void givenSecondFloatnum_shouldReturnMax() {
        Float max = maximum.number(2.5f, 3.5f, 1.5f);
        Assert.assertEquals((Float) 3.5f, max);
    }

    @Test
    public void givenThirdFloatnum_shouldReturnMax() {
        Float max = maximum.number(1.5f, 2.5f, 3.5f);
        Assert.assertEquals((Float) 3.5f, max);
    }

    @Test
    public void givenfirstLargeName_shouldReturnLargename() {
        String max = maximum.number("peach", "apple", "mango");
        Assert.assertEquals((String) "peach", max);
    }

    @Test
    public void givenSecondLargeName_shouldReturnLargename() {
        String max = maximum.number("apple", "kiwi", "peach");
        Assert.assertEquals((String) "peach", max);
    }

    @Test
    public void givenThirdLargeName_shouldReturnLargename() {
        String max = maximum.number("apple", "kiwi", "peach");
        Assert.assertEquals((String) "peach", max);
    }
}
