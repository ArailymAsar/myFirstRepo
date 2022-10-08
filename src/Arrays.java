public class Arrays {
    public static void main(String[] args) {
        //Given an array/list [] of integers , Find all the LEADERS in the array.
        int[] array = {16, 17, 4, 3, 5, 2};
        int[] array1 = {};
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++){
                if (array[i] > array[j]){
                    continue;
                }
            }
        }
    }
}
