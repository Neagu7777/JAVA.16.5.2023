public class Arrays_poscitati_summu_vsech_cisel_masive {
    // посчитать сумму всех чисел в масиве
    public static void main(String[] args) {
        int [] arr = {15, 20, 6, 8, 12};
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            //    int number = number + arr[i]; полная версия цикла
            number+= arr[i];                          //   сокращенная вермия цикла


        }
        System.out.println(number);
    }
}

