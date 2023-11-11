

public class Array_Masivy_srednee_znacenie_elementov_v_masive {
      //Среднее значение элементов в масиве
        public static void main(String[] args) {
            System.out.println("Среднее значение элементов массива,суммирование элементов");
        int[] list = {15, 20, 6, 8, 12, 10};
        //среднее значение это когда элементы слаживаешь, пример 15+10, 20+12, 6+8
        //элемент это 15,20,6,8,12,10
        //индекс это  0 1 2 3 4 5, счет начинается с 0

        for (int i = 0; i < list.length; i++) {

            if (i == list.length - i - 1) { // таким образом мы показываем 1 элемент == последнему элементу
                System.out.println(list[i]); // ввыводим на экран каждый элемент
            } else if (i < list.length - i) {
                System.out.println(list[i] + list[list.length - i - 1]); // суммирует первый и последний элемент


            }
        }
            System.out.println("Среднее значение элементов массива");
            double[] point = {20, 56, 13, 22, 8}; //Все элементы делим на количество элементов
            double sum3 = 0;
            for (int x = 0; x < point.length; x++) {
                sum3+= point[x] / point.length;
                
            }
            System.out.println(sum3);

            System.out.println("Среднее значение элементов массива");
            double[] list1 = {20, 56, 13, 22, 8}; //сама не знаю что получилось
            double sum4 = 0;
            for (int y = 0; y < list1.length; y++) {
                if(y == list1.length -y -1){
                    System.out.println(y);
                } else if (y < list1.length-y)
                   // sum4+= list1[y] / list1.length -y -1;

                sum4 += (list1[y] / list1.length) - y - 1;

            }
            //System.out.println(list[y] / list.length -y -1);
            //sum4 += (list1[y] / list1.length) - y - 1;
    }
}
