package humans;

import humans.Person;

public class OOP_Abstraction_Encapsulation {

    public static void main(String[] args) {
        Person john = new Person("John", 'M', 30); //это объект
//        john.name = "John";
//        john.sex = 'M';
//        john.age = 30;

        Person jane = new Person("Jane",'F', 31); //это объект
//        jane.name = "Jane";
//        jane.sex = 'F';
//        jane.age = 31;

        john.mother = jane;
        john.father = new Person("Jake", 'F', 60);
        john.setFather("Jake", 'F', 60); //метод который создает нового отца

        john.printName();
        jane.printName();
        jane.setMother("Mary", 'F', 54);

        System.out.println(String.format("name: %s, sex: %s, age: %s, mother: %s, father: %s", jane.name, jane.sex, jane.age, john.mother.name, john.father.name));
        System.out.println(String.format("name: %s, sex: %s, age: %s", john.name, john.sex, john.age));
        System.out.println(String.format("name: %s, sex: %s, age: %s", john.name, john.sex, john.age, john.getAge(), john.getName(), john.getAge(), john.getFather(), john.getMother()));

        //public - доступно из любого класса, пакета отовсюду и всем
        //default - когда не указано ничего, доступен только внутри пакета
        //private - доступен только внутри класса
        //protected - доступ для к полям только наследованным классам (объект находится в родителе)
        //Encapsulation - прятать объекты с помощью private, указывать их в методе
        //полиморфизм - нотация override - возможность изменять поведения методов от родителя к потомку
        //наследование только от родителя к потомку
        //static = хранятся вместе с классном, будет хранится в единственном числе

        int[] arr = {1, 8, -3};
        int max= Integer.MAX_VALUE;
        for (int num:arr) { //foreach
            if (num > max){
                max = num;
            }
        }
        System.out.println("largest num " + max);


    }
}
