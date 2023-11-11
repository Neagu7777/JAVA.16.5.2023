public class Array_Masivy_suma_vsech_elementov_masiva {
    public static void main(String[] args) {
        //Найти сумму всех элементов массива

        System.out.println("Cумма всех элементов массива");
        int[] array = {5, 25, 33, 87, 12};
        int sum = 0;
//        for (int i = 0; i < array.length; i++) {  - sout выводим за фигурную скобку, чтобы результат был целым а не по возрастанию
//            sum+= array[i];
        for (int i : array)// сокращеная форма
            sum += i;
        System.out.println(sum);

        System.out.println("Сумма всех элементов массива");
        int[] array1 = {10, 15, 18, 40, 30, 10};
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 = sum1 + array1[i]; // или сакращенная форма sum1+= array1[i];

        }
        System.out.println(sum1);

    }

    }


