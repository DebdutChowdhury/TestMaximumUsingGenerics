package com.generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericMaximumTest {
    GenericMaximum maximum = new GenericMaximum();
    @Test
    public void givenfirstnum_shouldReturnMax() {
        Float max = maximum.number(3.5f,2.5f,1.5f);
        Assert.assertEquals((Float) 3.5f, max);
    }

    @Test
    public void givenSecondnum_shouldReturnMax() {
        Float max = maximum.number(2.5f, 3.5f, 1.5f);
        Assert.assertEquals((Float) 3.5f, max);
    }

    @Test
    public void givenThirdnum_shouldReturnMax() {
        Float max = maximum.number(1.5f, 2.5f, 3.5f);
        Assert.assertEquals((Float) 3.5f, max);
    }
}
