import java.util.ArrayList;

public class Array_list_collections {
    public static void main(String[] args) {
        //Колекции в жава
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1,30);

        for(Integer el : numbers) {
//        for (int i = 0; i < numbers.add(); i++) {
            System.out.println(el);
        }
    }
}
