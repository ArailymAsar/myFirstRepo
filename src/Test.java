public class Test {

    public static double A = 1.2345; //хранится с самим классом (не хранятся с экземплярами и объектами), может быть только один

    private String name; //объекты могут быть несколько

    /*
        Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.
         */

    public static String returnString(double a){

        int rub = (int) a;
        int kop = (int) ((a - rub) * 100);

        String str = "";
        if (kop >= 0 && kop < 9){
            str = rub +  " rub " + " 0 " + kop + " kop ";
        }else {
            str = rub +  " rub " + kop + " kop ";
        }

        return str;
    }


    public static void main(String[] args) {
        System.out.println(returnString(10.75));




    }


}
