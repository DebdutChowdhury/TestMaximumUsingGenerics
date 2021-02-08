package com.generic;

public class GenericMaximum {
    public Float number(Float firstnumber, Float secondnumber, Float thirdnumber){
        Float max = firstnumber;
        if(secondnumber.compareTo(max) > 0)
            max = secondnumber;
        if(thirdnumber.compareTo(max) > 0)
            max = thirdnumber;
        return max;
    }
}
