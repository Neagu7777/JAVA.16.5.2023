public class Array_Multidimensional_arrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
//        System.out.println(numbers[1]); // одномерный масив
        int[] [] matrice = {{1,2,3,4,5},//  двух мерный масив
                {4,5,6},
                {7,8,9}};  // первая скобка это строка, вторая столбец
//        System.out.println(matrice[2][2]);
//        System.out.println(matrice[1][0]);
//        System.out.println(matrice[0][4]);
//
//        int[] numbers1 = new int[5];
//        String [] [] strings = new String[2][3];
//        strings[0] [1] = "Privet";
//        System.out.println(strings[0][1]);

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.println(matrice[i][j] + " ");

            }
            System.out.println();
        }
    }
}
