public class Array_javleajetsea_masiv_simitricnym {
    public static void main(String[] args) {
//        -Найти сумму элементов в заданном одномерном массиве.
//        -Найти наибольший элемент в заданном одномерном массиве.
//        -Подсчитать количество четных элементов в заданном одномерном массиве.

        int[] arr = {10, 15, 3, 8, 6, 5};
        int number = 0;
        for (int i = 0; i < arr.length; i++) {

            number += arr[i];

        }
        System.out.println(number);


//        int[] arrey2 = {10, 15, 3, 8, 6, 5};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            max = Math.max(max, arr[i]);

        }
        System.out.println(max);


//        int[] array= {10, 15, 3, 8, 6, 5};
        int result = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result++;

            }


        }
        System.out.println(result);

//-Проверить, является ли заданный одномерный массив симметричным (элементы симметрично расположены относительно центра).
//            -Найти произведение элементов в заданном одномерном массиве. умножение
//-Проверить, есть ли в заданном одномерном массиве повторяющиеся элементы.
//    Уровень сложности 3 из 10:
//        int[] array= {10, 15, 3, 8, 6, 5};


        int[] arr2 = {3, 4, 5, 5, 4, 3};

        if (arr2[0] != arr2[arr2.length - 1]) {
            System.out.println("massiv not simm");
        } else {
            for (int i = 0, j = arr2.length - 1; i < arr2.length / 2; i++, j--) {
                if (arr2[i] == arr2[j]) {
                    System.out.println("massiv simm");
                }
            }
        }


        if (arr[0] != arr[arr.length - 1]) {
            System.out.println("massiv not simm");
        } else {
            for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
                if (arr[i] == arr[j]) {
                    System.out.println("massiv simm");
                }
            }

        }
        int number1 = 1;
        for (int i = 0; i < arr.length; i++) {

            number1 *= arr[i];

        }
        System.out.println(number1);

        System.out.println(isSameElem(arr));
        System.out.println(isSameElem(arr2));
    }

    public static boolean isSameElem(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }


        return false;

//        -Отсортировать заданный одномерный массив по возрастанию.
//       -Проверить, является ли заданный одномерный массив палиндромом (читается одинаково слева направо и справа налево).
//       -Удалить все отрицательные элементы из заданного одномерного массива.
//    public static boolean isSameElem(int[]){
//            int[] arr3 = {25, 6, 8, 9, 12};
//            for (int i = arr3.length - 1; i >= 0; i++)
//                if (arr3[i].length() < 4) {
//                    System.out.println(arr3[i]);
//                }
    }
}