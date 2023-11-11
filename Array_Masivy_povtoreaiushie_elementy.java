public class Array_Masivy_povtoreaiushie_elementy {
//Среднее значение элементов в масиве
        public static void main(String[] args) {
                System.out.println("Определить, если есть повторяющие элементы");

                int[] array = {15, 20, 6, 8, 15, 10};
                //int sum = 0;
                for (int i = 0; i < array.length; i++) {
                        for (int j = i + 1; j < array.length; j++) {
                                if (array[i] == array[j]) {
                                        System.out.println(array[i] == array[j]);
                                        // return true;
                                }
                        }
                }
                //return false;

                System.out.println("Есть ли в масиве повторяющие элементы");
                int[] list2 = {10, 20, 6, 8, 12, 10};
                int start = 0;
                for (int x = 0; x < list2.length; x++) {
                        for (int y = x + 1; y < list2.length; y++) {
                                if (start == list2[0] && start != list2[0]) {
                                } else {
                                        System.out.println(list2[0] == list2[0]);
                                        System.out.println(true);
                                }
                                break;


                        }

                        int[] num3 = new int[]{28, 26, 27, 27, 26};
                        for (int j = 0; j < num3.length; j++) {
                                for (int k = j + 1; k < num3.length; k++) {
                                        if (num3[j] == num3[k]) {
                                                System.out.println("есть повторяющие элементы");
                                        }
                                        break;
                                }
                        }
                }
        }}