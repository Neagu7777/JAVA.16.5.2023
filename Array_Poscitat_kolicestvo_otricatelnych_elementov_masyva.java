public class Array_Poscitat_kolicestvo_otricatelnych_elementov_masyva {
    public static void main(String[] args) {
        System.out.println("Выыодим отрицательные числа");
        int[] a = {11, 2, 4, 3, 5, -2, -8, -1, 9, 0};
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0)
                k++;
        }
        int j = 0;
        int[] b = new int[k];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                b[j] = a[i];
                j++;
            }
        }
        for (j = 0; j < b.length; j++)
            System.out.println(b[j] + " ");

        System.out.println("У меня не получилось");
        System.out.println("Количество четных элементов(количество индексов) ");
    }
}
