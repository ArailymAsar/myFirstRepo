import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Extra_tasks {
    public static void main(String[] args) {
        /*
        Extra Задача №2
        Создать массив строк из любой строчки песни/текста (длина массива не менее 5 элементов).
        Любыми доступными знаниями выстроить элементы массива в алфавитном порядке. Вывести на печать
         */
        String[] array = {"As", "a", "decrepit", "2father", "takes,", "delight", "To", "!see", "his", "active", "child",
                "do", "deeds", "of", "youth"};
//        for (int i = 0; i < array.length; i++) {
//            Arrays.sort(array);
//        }
//        System.out.println(Arrays.toString(array));

        char[] alfa = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < alfa.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[j].toLowerCase().charAt(0) == alfa[i]){
                    System.out.println(array[j]);
                }
            }
        }

//        for (int i = 0; i < array.length; i++) {
//            if (array[i].toLowerCase().charAt(0) == 'a') {
//                System.out.println(array[i]);
//            } else {
//                if (array[i].toLowerCase().charAt(0) == 'b') {
//                    System.out.println(array[i]);
//                } else {
//                    if (array[i].toLowerCase().charAt(0) == 'c') {
//                        System.out.println(array[i]);
//                    } else {
//                        if (array[i].toLowerCase().charAt(0) == 'd') {
//                            System.out.println(array[i]);
//                        } else {
//                            if (array[i].toLowerCase().charAt(0) == 'e') {
//                                System.out.println(array[i]);
//                            } else {
//                                if (array[i].toLowerCase().charAt(0) == 'f') {
//                                    System.out.println(array[i]);
//                                } else {
//                                    if (array[i].toLowerCase().charAt(0) == 'g') {
//                                        System.out.println(array[i]);
//                                    } else {
//                                        if (array[i].toLowerCase().charAt(0) == 'h') {
//                                            System.out.println(array[i]);
//                                        } else {
//                                            if (array[i].toLowerCase().charAt(0) == 'i') {
//                                                System.out.println(array[i]);
//                                            } else {
//                                                if (array[i].toLowerCase().charAt(0) == 'j') {
//                                                    System.out.println(array[i]);
//                                                } else {
//                                                    if (array[i].toLowerCase().charAt(0) == 'k') {
//                                                        System.out.println(array[i]);
//                                                    } else {
//                                                        if (array[i].toLowerCase().charAt(0) == 'l') {
//                                                            System.out.println(array[i]);
//                                                        } else {
//                                                            if (array[i].toLowerCase().charAt(0) == 'm') {
//                                                                System.out.println(array[i]);
//                                                            } else {
//                                                                if (array[i].toLowerCase().charAt(0) == 'n') {
//                                                                    System.out.println(array[i]);
//                                                                } else {
//                                                                    if (array[i].toLowerCase().charAt(0) == 'o') {
//                                                                        System.out.println(array[i]);
//                                                                    } else {
//                                                                        if (array[i].toLowerCase().charAt(0) == 'p') {
//                                                                            System.out.println(array[i]);
//                                                                        } else {
//                                                                            if (array[i].toLowerCase().charAt(0) == 'q') {
//                                                                                System.out.println(array[i]);
//                                                                            } else {
//                                                                                if (array[i].toLowerCase().charAt(0) == 'r') {
//                                                                                    System.out.println(array[i]);
//                                                                                } else {
//                                                                                    if (array[i].toLowerCase().charAt(0) == 's') {
//                                                                                        System.out.println(array[i]);
//                                                                                    } else {
//                                                                                        if (array[i].toLowerCase().charAt(0) == 't') {
//                                                                                            System.out.println(array[i]);
//                                                                                        } else {
//                                                                                            if (array[i].toLowerCase().charAt(0) == 'u') {
//                                                                                                System.out.println(array[i]);
//                                                                                            } else {
//                                                                                                if (array[i].toLowerCase().charAt(0) == 'v') {
//                                                                                                    System.out.println(array[i]);
//                                                                                                } else {
//                                                                                                    if (array[i].toLowerCase().charAt(0) == 'w') {
//                                                                                                        System.out.println(array[i]);
//                                                                                                    } else {
//                                                                                                        if (array[i].toLowerCase().charAt(0) == 'x') {
//                                                                                                            System.out.println(array[i]);
//                                                                                                        } else {
//                                                                                                            if (array[i].toLowerCase().charAt(0) == 'y') {
//                                                                                                                System.out.println(array[i]);
//                                                                                                            } else {
//                                                                                                                if (array[i].toLowerCase().charAt(0) == 'z') {
//                                                                                                                    System.out.println(array[i]);
//                                                                                                                }
//                                                                                                            }
//                                                                                                        }
//                                                                                                    }
//                                                                                                }
//                                                                                            }
//                                                                                        }
//                                                                                    }
//                                                                                }
//                                                                            }
//                                                                        }
//                                                                    }
//                                                                }
//                                                            }
//                                                        }
//                                                    }
//                                                }
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }

        /*
        Создать массив строк из любой строчки песни/текста (длина массива не менее 10 элементов).
        Любыми доступными знаниями подсчитать и вывести на печать каждую букву что встречается в массиве.
        (Пример а = 5, b = 4, если = 0 можно не выводить на печать).
         */
//        System.out.println("**********************");
//        int count = 0;
//        int[] countArray = new int[26];
//        for (int i = 0; i < alfa.length; i++){
//            for (int j = 0; j < array.length; j++){
//                for (int l = 0; l < array[j].length(); l++){
//                    if(alfa[i] == array[j].toLowerCase().charAt(l)){
//                        countArray[i]++;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < alfa.length; i++){
//            System.out.println(alfa[i] + " = " + countArray[i]);
//        }

//                if (array[i].toLowerCase().charAt(j) == 'a') {
//                    count[0]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'b') {
//                    count[1]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'c') {
//                    count[2]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'd') {
//                    count[3]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'e') {
//                    count[4]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'f') {
//                    count[5]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'g') {
//                    count[6]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'h') {
//                    count[7]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'i') {
//                    count[8]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'j') {
//                    count[9]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'k') {
//                    count[10]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'l') {
//                    count[11]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'm') {
//                    count[12]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'n') {
//                    count[13]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'o') {
//                    count[14]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'p') {
//                    count[15]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'q') {
//                    count[16]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'r') {
//                    count[17]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 's') {
//                    count[18]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 't') {
//                    count[19]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'u') {
//                    count[20]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'v') {
//                    count[21]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'w') {
//                    count[22]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'x') {
//                    count[23]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'y') {
//                    count[24]++;
//                }
//                if (array[i].toLowerCase().charAt(j) == 'z') {
//                    count[25]++;
//                }








    }
}

