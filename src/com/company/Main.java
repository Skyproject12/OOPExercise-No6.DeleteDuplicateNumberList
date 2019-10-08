package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> number= new ArrayList<>();
        number.add(1);
        number.add(4);
        number.add(1);
        number.add(2);
        number.add(6);
        number.add(6);
        System.out.println("ArrayList with duplicates removed: "
                + number);
        Set<Integer> num= new HashSet<>();
        for (int nomber : number ){
            if(num.add(nomber)==true){
                System.out.println("menghapus duplicate");
                System.out.println(nomber);
            }
        }
    }
}
