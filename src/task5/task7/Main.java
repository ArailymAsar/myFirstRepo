package task5.task7;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Kate", 1992, 'F');
        System.out.println(myPerson.getName());
        System.out.println(String.format("name: %s, age: %s, sex: %s", myPerson.getName(), myPerson.getAge(), myPerson.getSex()));
    }
}
