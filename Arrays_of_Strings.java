public class Arrays_of_Strings {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 10;
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
        String[] strings = new String[3];
        strings[0] = "Privet";
        strings[1] = "Poka";
        strings[2] = "java";
//        System.out.println(strings[0]);
//        System.out.println(strings[2]);
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);

        }
        for(String string:strings) { //строки:масив
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x:numbers1){
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum);


        int o; //коробка куда помещаем число
        String s = null; //ссылка и сама строка         адрес = дом
//       null - это пустота
        System.out.println(s);

    }
}
