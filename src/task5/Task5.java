package task5;

public class Task5 {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;
    }
}
