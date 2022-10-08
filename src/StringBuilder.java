public class StringBuilder {

    public static String noSpace(final String x){
        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();

        for (int i = 0; i < x.length(); i ++){
            if (x.charAt(i) != ' '){
                stringBuilder.append(x.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(noSpace("Kate is good"));

    }
}
