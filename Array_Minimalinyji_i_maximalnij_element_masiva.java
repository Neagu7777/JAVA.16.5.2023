public class Array_Minimalinyji_i_maximalnij_element_masiva {
    public static void main(String[] args) {
        int a[] = {3, 5, 10, 6, 2, 4};
        int minimum = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minimum)
             minimum = a[i];
        }

        System.out.println("Минимальный по величине элемент " + minimum);

        int b[] = {3, 5, 10, 6, 2, 4};
        int maximum = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] > maximum)
                maximum = b[i];
        }

        System.out.println("Максимальный по величине элемент " + maximum);

    }
}






