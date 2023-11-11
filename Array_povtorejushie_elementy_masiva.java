public class Array_povtorejushie_elementy_masiva {
    public static void main(String[] args) {
        System.out.println("Сумма всех элементов массива");
        int[] array = {10, 15, 18, 40, 30, 10};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        System.out.println(sum);


        System.out.println("Среднее значение элементов массива");
        int[] list = {15, 20, 6, 8, 12, 10};

        for (int i = 0; i < list.length; i++) {

            if (i == list.length - i - 1) {
                System.out.println(list[i]);
            } else if (i < list.length - i) {
                System.out.println(list[i] + list[list.length - i - 1]);


            }
        }


        System.out.println("Есть ли в масиве повторяющие элементы");
        int[] list2 = {10, 20, 6, 8, 12, 10};
        int start = 0;
        for (int i = 0; i < list2.length; i++) {
//            for (int j = i + 1; j < list2.length; j++) {
            if (start == list2 [0] && start != list2 [0]) {
            }else
                System.out.println();


        }
    }
}



