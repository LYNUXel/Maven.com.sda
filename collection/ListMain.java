package com.sda.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> listInterger = new LinkedList<Integer>();  // we can't insert an object from an abstract class !
        listInterger.add(1);
        listInterger.add(5);
        listInterger.add(3);
        listInterger.add(2);

        System.out.println(listInterger); // used in the place of toString !!!

//      listInterger.contains(7); .. so we can use to print, next line
        System.out.println(listInterger.contains(7));

        listInterger.add(0, 7); // adding 7 number to position 0 !!!
        System.out.println(listInterger);

        Collections.sort(listInterger);
        System.out.println(listInterger);

        listInterger.remove(0);
        System.out.println(listInterger);

        List<Integer> integerList2 = new ArrayList<Integer>();
        integerList2.add(100);
        integerList2.addAll(listInterger);
        System.out.println(integerList2);

        List<Integer> impairNumbers = new LinkedList<Integer>();

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                impairNumbers.add(i);
            }
            System.out.println("Impair Numbers are: " + impairNumbers);
        }
    }
}
