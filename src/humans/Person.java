package humans;

public class Person { //при создании класса создается новый тип данных
    public String name; //это объект

    public char sex;//это объект

    public int age; //это объект

    public Person mother;
    public Person father;

    public Person(String name, char sex, int age){ //это конструкция. для конструктора метод всегда возвращает void (не пишется), отличие от метода что имя метода совподает с именем класса
        this.name = name; //this это обращение к объекту
        this.sex = sex;
        this.age = age;
    }
    public void printName(){
        System.out.println(name);
    }

    public String getName(){
        if(this.sex == 'M'){
            return "Mr " + this.name;
        }else {
            return "Ms " + this.name;
        }
    }

    public void setMother(String name, char sex, int age){
        this.mother = new Person(name, sex, age);
    }

    public void setMother(Person mother){ //когда объекты private
        this.mother = mother;
    }

    public void setFather(String name, char sex, int age){
        this.father = new Person(name, sex, age);
    }


    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }
}
