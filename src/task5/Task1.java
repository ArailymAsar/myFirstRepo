package task5;

public class Task1 {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null) {
                if (arrayOfSheeps[i] == true) {
                    count++;
                }
            } else {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Boolean[] array1 = {null, null, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        System.out.println(countSheeps(array1));
    }
}
