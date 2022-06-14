package com.compan;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Random ran = new Random();
        int[] massiv=new int[20];

        for (int i = 0; i < massiv.length ; i++) {
            massiv[i]= ran.nextInt(0,2);
            Arrays.sort(massiv);
            System.out.print(massiv[i]+"  ");
        }

        System.out.println();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            arrayList.add(ran.nextInt(0,2));
            //System.out.print(arrayList.get(i)+"a  ");
        }
        System.out.println();
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            linkedList.add(ran.nextInt(0, 2));
           // System.out.print(linkedList.get(i) + "l  ");
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println();
        Collections.sort(linkedList);
        System.out.println(linkedList);
        //System.out.println("************");

    }

}