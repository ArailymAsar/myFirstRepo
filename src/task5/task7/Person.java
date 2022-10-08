package task5.task7;

import java.util.Calendar;

public class Person {
    private String name;
    private char sex;

    private int age;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth, char sex) {
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
    }

    public Person(String name){
        this.name = name;
    }

//    public Person(){
//        this(name);
//    }
    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }
    public char getSex() {
        return sex;
    }
    public String getName() {
        if (this.sex == 'M') {
            return "Mr " + this.name;
        } else if (this.sex == 'F') {
            return "Ms " + this.name;
        } else {
            return name;
        }
    }

//    switch (this.sex) {
//        case 'M':
//            return "Mr " + this.name;
//        case: 'F':
//            return "Ms " + this.name;
//        default:
//            return name;
//    }
}
