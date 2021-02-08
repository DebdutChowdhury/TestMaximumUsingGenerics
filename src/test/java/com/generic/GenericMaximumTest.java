package com.generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericMaximumTest {
    GenericMaximum maximum = new GenericMaximum();
    @Test
    public void givenfirstnum_shouldReturnMax() {
        String max = maximum.number("peach", "apple", "mango");
        Assert.assertEquals((String) "peach", max);
    }

    @Test
    public void givenSecondnum_shouldReturnMax() {
        String max = maximum.number("apple", "kiwi", "peach");
        Assert.assertEquals((String) "peach", max);
    }

    @Test
    public void givenThirdnum_shouldReturnMax() {
        String max = maximum.number("apple", "kiwi", "peach");
        Assert.assertEquals((String) "peach", max);
    }
}
