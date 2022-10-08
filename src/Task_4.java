public class Task_4 {

    public static int additionOfNumbers(int a, int b) {
        return a + b;
    }

    public static int subtractionOfNumbers(int a, int b) {
        return a - b;
    }

    public static int multiplicationOfNumbers(int a, int b) {
        return a * b;
    }

    public static int divisionOfNumbers(int a, int b) {
        if (b == 0) {
            System.out.println("error");
        }
        return a / b;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        //версия Дмитрия

        for (int i = 9; i >= 0; i--){ //10 строк от 0 до 9
            for (int j = 0; j <= i; j++){ //от 0 до переменной цикла
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        //версия Дмитрия
        for (int i = 9; i >= 0; i--){ //10 строк от 0 до 9
            for (int j = 0; j < 9 - i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++){ //от 0 до переменной цикла
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");


        int row = 19;
        int num = 9;
        for (int i = row; i >= 1; i--) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k != (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //версия Дмитрия
        for (int i = 9; i >= 0; i --){
            for (int j = 0; j < 9 - i; j ++){
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j --){
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");




        System.out.println(additionOfNumbers(5, 10));
        System.out.println(subtractionOfNumbers(5, 10));
        System.out.println(multiplicationOfNumbers(5, 10));
        System.out.println(divisionOfNumbers(5, 20));

    }
}
