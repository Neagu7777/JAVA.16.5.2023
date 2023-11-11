public class Array_Masiv_v_poreadki_ocerednosti_metod_puzrka {
    public static void main(String[] args) {
        byte a[] = {3, 5, 1, 6, 2, 4};

        for (int i = 0; i < a.length-1; ++i) {
            byte min = a[i];
            int pos = i;

            for (int j = i + 1; j < a.length; ++j)
                if (min > a[j]) {
                    pos = j;
                    min = a[j];
                }

            byte t = a[i];
            a[i] = a[pos];
            a[pos] = t;
        }
        System.out.println(" Ввывод на экран по очередности");
        for (short val : a) System.out.print(val+" ");
    }
}



