public class Task_3 {
    public static void main(String[] args) {
        /*
        необходимо вывести сумму всех значений массива.
         */
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Array sum: " + sum);

        /*
        необходимо вывести максимальное значение массива.
         */
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Array max: " + max);

        /*
        необходимо вывести минимальное значение массива
         */
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Array min: " + min);

        /*
        необходимо вывести среднее арифметическое всех значений массива.
         */
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 = sum1 + array1[i];
        }
        double avg = sum1 / array1.length;
        System.out.println("Array avg: " + avg);

        /*
        необходимо вывести сумму элементов массива
         */
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum2 = sum2 + array2[i][j];
            }
        }
        System.out.println("Two-dimensional array sum: " + sum2);

        /*
        необходимо вывести максимальное значение массива
         */
        int max1 = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (max1 < array2[i][j]) {
                    max1 = array2[i][j];
                }
            }
        }
        System.out.println("Two-dimensional array max: " + max1);

        /*
        необходимо вывести количество элементов в массиве.
         */
        int index = 0;
        for (int i = 0; i < array2.length; i++) {
            index++;
            for (int j = 0; j < array2[i].length; j++) {
                index++;
            }
        }
        System.out.println("Two-dimensional array index: " + index);
    }
}
