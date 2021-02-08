package com.generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericMaximumTest {
//    GenericMaximum maximum = new GenericMaximum();
    //here test cases for integer number
    @Test
    public void givenfirstnum_shouldReturnMax() {
        Integer[] value = {3,2,1};
        Integer max = new GenericMaximum<>(value).number();
        Assert.assertEquals((Integer)3, max);
    }

    @Test
    public void givenSecondnum_shouldReturnMax() {
        Integer[] value = {2, 3, 1};
        Integer max = new GenericMaximum<>(value).number();
        Assert.assertEquals((Integer)3, max);
    }

    @Test
    public void givenThirdnum_shouldReturnMax() {
        Integer[] value = {1, 2, 3};
        Integer max = new GenericMaximum<>(value).number();
        Assert.assertEquals((Integer)3, max);
    }

    // here test cases for float number
    @Test
    public void givenFirstFloatNum_shouldReturnMax() {
        Float[] value = {3.5f,2.5f,1.5f};
        Float max = new GenericMaximum<>(value).number();
        Assert.assertEquals((Float) 3.5f, max);
    }

    @Test
    public void givenSecondFloatnum_shouldReturnMax() {
        Float[] value = {2.5f, 3.5f, 1.5f};
        Float max = new GenericMaximum<>(value).number();
        Assert.assertEquals((Float) 3.5f, max);
    }

    @Test
    public void givenThirdFloatnum_shouldReturnMax() {
        Float[] value = {1.5f, 2.5f, 3.5f};
        Float max = new GenericMaximum<>(value).number();
        Assert.assertEquals((Float) 3.5f, max);
    }

    // here test cases for string
    @Test
    public void givenfirstLargeName_shouldReturnLargename() {
        String[] name = {"peach", "apple", "mango"};
        String max = new GenericMaximum<>(name).number();
        Assert.assertEquals((String) "peach", max);
    }

    @Test
    public void givenSecondLargeName_shouldReturnLargename() {
        String[] name = {"apple", "kiwi", "peach"};
        String max = new GenericMaximum<>(name).number();
        Assert.assertEquals((String) "peach", max);
    }

    @Test
    public void givenThirdLargeName_shouldReturnLargename() {
        String[] name = {"apple", "kiwi", "peach"};
        String max = new GenericMaximum<>(name).number();
        Assert.assertEquals((String) "peach", max);
    }
}
