package com.generic;

public class GenericMaximum {
    public <E extends Comparable> E number(E firstname, E secondname, E thirdname){
        E max = firstname;
        if(secondname.compareTo(max) > 0)
            max = secondname;
        if(thirdname.compareTo(max) > 0)
            max = thirdname;
        printName(max);
        return max;
    }

    public <E> void printName(E number){
        System.out.println("Max name: "+number);
    }
}
