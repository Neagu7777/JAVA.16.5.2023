public class Array_Masiv_citaem_s_levo_na_pravo_i_naoborot {
    public static void main(String[] args) {
        System.out.println("Элементы с справо на лево");

        double [] polidrom = {2.5, 3.6, 4.8, 7.3};

        for (int i = polidrom.length -1; i >= 0; i--) {

            System.out.println(polidrom[i]);

        }

        System.out.println("Элементы с лево на право");
        for (int y = 0 ; y < polidrom.length; y++) {

        System.out.println(polidrom[y]);

    }}}

