public class Array_Poscitat_kolicestvo_cetnych_elementov_masiva {
    public static void main(String[] args) {
        double[] arr = {15, 22, 6, 78, 9};
        //int num = arr[];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)

                System.out.println("Четные элементы масива "+arr[i]);
//             if (arr[i] == num)
                index += arr[i]; //+ num;
        }
        System.out.println("У меня не получилось");
        System.out.println("Количество четных элементов(количество индексов) "+ index);
    }

}

