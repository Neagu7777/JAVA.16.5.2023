public class Arrays_cetnoje_i_necetnoje {
        public static void main(String[] args) {
            //если число четное, выводим на экран, ---если не четное, тогда считае сколько раз оно встретилось в массиве
            int[] array = {10, 5, 6, 7, 12, 45};
            int result = 0;
            for (int i = 0; i < array.length; i++) {

                if (array[i]%2==0){
                    System.out.println("Остаток");
                    System.out.println(array[i]);
                }
                else {
                    result++;
                    System.out.println(result);
                }
            }
        }
    }


