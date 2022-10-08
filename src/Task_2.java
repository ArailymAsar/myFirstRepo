public class Task_2 {

    public static void main(String[] args) {

        System.out.println("******Task#1******");
        int a = 13;
        int b = -14;

        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }

        System.out.println("******Task#2******");
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        System.out.println("******Task#3******");
        int c = 101;
        if (c > 10) {
            System.out.println("больше 10");
        }
        if (c < 100) {
            System.out.println("меньше 100");
        }
        if ((c / 2) > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (c >= 5 && c <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

        System.out.println("******Task#4******");
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }

        System.out.println("******Task#5******");
        int num = 5;
        int step = 1;
        int result = num;
        do {
            System.out.println(result);
            step++;
            result = result * num;
        } while (result <= 10000);

        System.out.println("******Task#6.1******");
        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("******Task#6.2******");
        for (int i = 40; i < 61; i = i + 4) {
            System.out.println(i);
        }
    }
}
