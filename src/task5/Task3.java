package task5;

public class Task3 {
    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower2 % 2 == 0 && flower1 % 2 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLove(0, 1));
    }
}

//return (flower1 + flower2) % 2 !=0;