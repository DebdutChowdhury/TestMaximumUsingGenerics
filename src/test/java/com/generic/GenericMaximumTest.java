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
}
