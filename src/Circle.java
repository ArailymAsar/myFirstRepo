public class Circle {
    public static void main(String[] args) {

        int rad = 5;
        int diameter = rad * 2;
        for (int i = 0; i <= diameter; i++){
            for (int j = 0; j <= diameter; j++){
                int xCoord = rad - i;
                int yCoord = rad - j;

                int point = xCoord * xCoord + yCoord * yCoord;
                if (point <= diameter + 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
