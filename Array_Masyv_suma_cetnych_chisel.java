import java.lang.*;


public class Array_Masyv_suma_cetnych_chisel {
    public static void main(String[] args) {

        int[] sum = {10, 25, 35, 40, 12, 16};

        int sum2 =0;

        for (int i = 0; i < sum.length; i++) {
            if(sum[i] % 2 == 0 ) {//&& i!= 0 -
                System.out.println("Ввыводим на экран четные элементы "+sum[i]); //- в данном случае мы выводим на экран все четные элементы
                sum2+=sum[i];
            }

        }
        System.out.println("Сумма четных чисел "+sum2);

    }

}

