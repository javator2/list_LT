package com.sdacademy.lists;

public class Main {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<Integer>();

        list.add(2);
        list.add(3);
        list.add(13);
        list.add(12);
        list.add(2);
        list.add(3);
        list.add(13);
        list.add(12);
        list.add(2);
        list.add(3);
        list.add(13);
        list.add(12);


        for (Integer list1 : list) {
            System.out.println(list1);
        }
    }
}
