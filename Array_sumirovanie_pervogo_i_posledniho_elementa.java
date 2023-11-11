package org.example;

/*
 Hello world!

 */


public class Array_sumirovanie_pervogo_i_posledniho_elementa {

    public static void main(String[] args) {
        System.out.println("сумирование масива");
        int[] arr = {15, 20, 6, 8, 12};
        int number = 0;
        for (int i = 0; i < arr.length; i++) {

            number += arr[i];

        }
        System.out.println(number);

        System.out.println("ввыводим стринговые сроки на экран");
        String[] string1 = {"april", "May", "junie", "julie", "april"};
        for (int i = string1.length - 1; i >= 0; i--) {
            if (string1[i].length() > 4) {
                System.out.println(string1[i]);
            }

        }
        System.out.println("сумирование первого и последниго элемента");
        int[] list = {15, 20, 6, 8, 12, 10};

        for (int i = 0; i < list.length; i++) {

            if (i == list.length - i - 1) {
                System.out.println(list[i]);
            } else if (i < list.length - i) {
                System.out.println(list[i] + list[list.length - i - 1]);

            }


        }
        System.out.println("делим масив поплам и сумируем");
        int[] array = {15, 20, 6, 8, 10, 12, 8};
        int result = 0;
        int middle = array.length / 2;

        for (int i = 0; i < array.length / 2; i++) {
            result = array[i] + array[middle];
            middle++;
            System.out.println(result);
        }
        System.out.println("непарный остаток масива");
        if (array.length % 2 == 1) {
            System.out.println(array[array.length - 1]);
        }


        System.out.println("показывает каждый второй индекс масива"); //показывает каждый второй индекс масива
        int[] num = {15, 20, 3, 8, 12, 7, 8};

        for (int i = 0; i < num.length; i = i + 2) {
            System.out.println(num[i]);
        }
    }
}



