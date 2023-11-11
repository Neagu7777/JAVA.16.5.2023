public class Arrays_string {
    public static void main(String[] args) {
        //масивв стрингов, нужно вывести на экран последний и первый месяц
        String[] strings1 = {"April", "May", "June", "August"};
        for (int i = strings1.length -1; i >=0; i--) {
            if (strings1[i].length()>4){
                System.out.println(strings1[i]);
            }

        }
    }
}
