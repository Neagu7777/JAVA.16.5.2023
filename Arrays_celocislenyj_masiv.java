public class Arrays_celocislenyj_masiv {
    public static void main(String[] args) {
        int number = 10; //примитивный тип данных
//        char character = 'a'; //примитивный тип данных
//        String s = "Hello";
//        String s1 = new String("Hello");

//  целочисленый масив
        int[] numbers = new int[5]; //ссылочный тип данных
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);//отчет масива идет с 0 1 2 3 4
        }
        int[] numbers1 = {1,2,3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);

        }
    }
}