public class Array_Vtoroi_po_velicine_eliment_v_masive {
    public static void main(String[] args) {
        int a[] = {3, 8, 1, 6, 2, 4};
        int max1 = 0;
        int max2 =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max1){
                max2= max1;
                max1=a[i];


            }else if(a[i] > max2 && a[i] != max1){
                max2 = a[i];
            }
        }
        System.out.println("Второй по величине элемент "+ max2);
        }


}




