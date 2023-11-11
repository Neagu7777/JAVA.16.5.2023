public class Array_Proverit_javleatsea_masiv_pustym {
    public static void main(String[] args) {
        int[] arr = new int[0]; //если ставим масив 0- он будет пустым: усли масив от 1-.. - то масив будет отоброжать
        if (arr.length == 0) {
            System.out.println("Массив пуст");
        } else {
            System.out.println("Массив не пуст");
        }

    }
}
