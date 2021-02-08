package com.generic;

public class GenericMaximum {
    public Integer number(Integer firstnumber, Integer secondnumber, Integer thirdnumber){
        Integer max = firstnumber;
        if(secondnumber.compareTo(max) > 0)
            max = secondnumber;
        if(thirdnumber.compareTo(max) > 0)
            max = thirdnumber;
        return max;
    }
}
