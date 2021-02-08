package com.generic;

public class GenericMaximum {
    public String  number(String firstname, String secondname, String thirdname){
        String max = firstname;
        if(secondname.compareTo(max) > 0)
            max = secondname;
        if(thirdname.compareTo(max) > 0)
            max = thirdname;
        return max;
    }
}
