import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class Array_Proverit_soderzit_masyv_hot_odno_cislo_cetnoje {

    public static void main(String[] args) throws IOException {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выводим 15 массивов");
            int[] mas = new int [15];
            int count1 = 0;
            int count2 = 0;
            int sumCh = 0;
            int sumNeCh = 0;

            for(int i = 0; i < mas.length; i++){
                mas[i] = Integer.parseInt(r.readLine());
                for(int i1 = 0; i1 < mas.length; i1++){
                    if(mas[i1] % 2 == 0){
                        sumCh += mas[i];
                    } else {
                        sumNeCh += mas[i];
                    }
                }
                if(sumCh > sumNeCh){
                    count1++;
                } else {
                    count2++;
                }
            }
            if(count1 > count2){

                System.out.println("В домах с четными номерами проживает больше жителей.");
            } else {
                System.out.println("В домах с нечетными номерами проживает больше жителей.");
            }
            //напишите тут ваш код
        }
    }

