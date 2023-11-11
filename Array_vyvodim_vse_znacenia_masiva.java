import java.util.Scanner;

public class Array_vyvodim_vse_znacenia_masiva {
    public static void main(String[] args) {
        //выводим на экран все значения масива,но при этом пользователь будет сам вносить все значения
        int[] array = new int[4];
        Scanner scann = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число: ");
            int value = scann.nextInt();
            array[i] = value;
        }
        //находим минимальное значение масива
        int min = array[0];
        for (int i = 0; i > array.length; i++) {
            if (array[i] > min) ;
            min = array[i];
        }
        System.out.println("Минимальное значение: "+ min);


        }
    }

