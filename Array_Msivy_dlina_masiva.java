public class Array_Msivy_dlina_masiva {
    public static void main(String[] args) {
        //Массивы данных
        int [] nums = new int[5];
        nums[0] = 45;
        nums[1] = 32;
        nums[2] = 1;
        nums[3] = 9;
        nums[4] = 3;
        int res = nums[2] + nums[3];//сумирование элемента 2+3

        System.out.println(res);
        // ввыводим все значения масива
        float [] nums2 = new float[] {5.0f, 6.45f, 89.984f};//находим второй элемент
        System.out.println(nums2[1]);//находим второй элемент

        for (int i = 0; i < nums2.length ; i++) { // nums2.length - используется для выявления всей длины масива,
            // для перебора цикла, возращает длину всего масива {5.0f, 6.45f, 89.984f};-i < nums2.length
            System.out.println("Element: "+ nums2[i]);

        }

    }
}
