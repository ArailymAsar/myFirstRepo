public class Pyramids {

    public static void main (String[] args){

        for (int i = 1; i < 6; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i < 6; i++){
            for (int j = 1; j <= 6 - i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 6; i ++){
            for (int j = 0; j < 6 - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i ++){
            System.out.print("* ");
            for (int k = 0; k < i; k++){
                System.out.print("0 ");
            }
            System.out.println("");
        }
    }
}
