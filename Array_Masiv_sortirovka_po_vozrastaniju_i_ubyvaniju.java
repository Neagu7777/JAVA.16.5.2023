public class Array_Masiv_sortirovka_po_vozrastaniju_i_ubyvaniju {



    public static void main(String[] args){

        String[] a = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
        //Выводим изначальный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);

        }
        System.out.println();

        System.out.println(" ввыводим на экран от первого индекса до последнего");
        int[] array= { 15, 16,17, 20,5, 8, 25};
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);


        }
        System.out.println("ввыводим на экран от последнего индекса до первого ");
        int[] array1= { 15, 16,17, 20,5, 8, 25};

        for (int i = array1.length-1; i >= 0; i--) {
            System.out.println(array1[i]);
    }
}}