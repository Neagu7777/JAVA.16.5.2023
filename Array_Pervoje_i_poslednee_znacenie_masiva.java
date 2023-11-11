public class Array_Pervoje_i_poslednee_znacenie_masiva {
    public static void main(String[] args) {
        //находим минимальное значение масива
        int[] array = {10, 5, 45, 56, 32};
        int min = array[0];
        for (int i = 0; i > array.length; i++) {
            if (array[i] > min) ;//ставим ; и увидим индекс, без них будет элемент
            min = array[i];
        }
        System.out.println("Минимальное значение-первый индекс масива: " + min);

        int[] array1 = {10, 5, 45, 56, 32};
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < max) ;
            max = array1[i];
        }
        System.out.println("Максимальное значение-последний индекс масива: " + max);



    }
}
