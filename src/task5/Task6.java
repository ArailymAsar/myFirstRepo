package task5;

public class Task6 {
    public static String countingSheep(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < num; i++) {
            str.append(i + 1 + " sheep...");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(1));
    }
    //public static String countingSheep(int num) {
    //    String s = "";
    //    for(int i = 1; i <= num; i++){
    //      s += s.format("%s sheep...", i);
    //    }
    //    return s;
    //  }
    //}
}
