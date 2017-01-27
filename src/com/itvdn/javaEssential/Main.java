package com.itvdn.javaEssential;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 * Created by lion on 24.01.17.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Collections.addAll(array, 10, 9, 8, 7, 6, 5, 4, 3, 2);

        ListIterator<Integer> listIterator = array.listIterator();
        while(listIterator.hasNext()){

            Integer integer = listIterator.next();
            listIterator.set(++integer);

            System.out.println(integer);

        }
       // System.out.println(array);
    }
}
