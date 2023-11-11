public class Array_Razdelenie_masyva_na_polozitelnye_i_otrycatelnye_cisla {
    public static void main(String[] args) {
        System.out.println("Розделение масива на положительные и отрицательные числа");
        int[] arr1 = {5, -2, 4, 10, -22, 35, -14, 45};
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        int[] arrpos = new int[pos];
        int[] arrneg = new int[neg];
        int countpos = 0;
        int countneg = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                arrpos[countpos] = arr1[i];
                countpos++;
            } else {
                arrneg[countneg] = arr1[i];
                countneg++;
            }
        }
        for (int i = 0; i < arrneg.length; i++) {
            System.out.println(arrneg[i]);
        }
        for (int i = 0; i < arrpos.length; i++) {
            System.out.println(arrpos[i]);
        }
    }}





