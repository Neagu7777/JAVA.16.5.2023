public class Array_vzory_Masyvy {
    public static void main(String[] args) {
        int[] number = new int[]{5, 10, 20, 35, 56};
        int num = 0;

        for (int i = 0; i < number.length; i++) {
            num += number[i];
//            num = num + number[i];

        }
        System.out.println(num);
        System.out.println(getSum(5,3));

        int[] num1 = new int[]{ 36, 28, 65, 15};
        int num2 = 0;
        for (int i = 0; i < num1.length; i++) {
            num2 += num1[i];

            int[] num3 = new int[]{28, 26, 27, 27, 26};
            for (int j = 0; j < num3.length; j++) {
                for (int k = j+1; k < num3.length; k++) {
                    if  (num3[j]==num3[k]){
                        System.out.println("повторяющие элементы");
                        break;
                    }
                }
            }
        }
        System.out.println(num2/num1.length);

        int[] num6 = new int[]{8, 10, 20, 35, 56, 13, 47};
        int min = num6[0];
        for (int i = 0; i < num6.length ; i++) {
            if (num6[i] < min){
                min = num6[i];

            }

        }
        System.out.println(min);


        int[] num8 = new int[]{8, 10, 25, 35, 35, 25, 10, 8};
        for (int i = 0, j = num8.length -1; i < num8.length/2; i++,j--) {
            if (num8[i] == num8[j]){
                System.out.println("элементы равны");
            }

        }
        System.out.println(isPalindrom(num8));
        System.out.println(isPalindrom(num6));
    }
    public static int getSum(int a, int b){
        return a+b;

    }
    public static boolean isPalindrom(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            if(array[i] != array[j]) {
                return false;
            }
        }
        return true;
    }
}

