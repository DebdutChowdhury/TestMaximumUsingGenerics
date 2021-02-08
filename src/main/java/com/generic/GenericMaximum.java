package com.generic;

public class GenericMaximum <D extends Comparable<D>>{
    D[] value;

    public GenericMaximum(D[] value) {
        this.value = value;
    }

    public D number(){
        if(value[0].compareTo(value[1]) > 0 && value[0].compareTo(value[2]) > 0){
            printName(value[0]);
            return value[0];
        }
        else if(value[1].compareTo(value[0]) > 0 && value[1].compareTo(value[2]) > 0){
            printName(value[1]);
            return value[1];
        }
        else
            printName(value[2]);
        return value[2];
    }

    public <E> void printName(E number){
        System.out.println("Max name: "+number);
    }
}
