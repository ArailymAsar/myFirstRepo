package task6;

public class Employee {

    /*
    Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и полем зарплата.
    Класс должен иметь метод isSameName(Employee employee) который возвращает true,
    если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
     */

    private String name;

    private char sex;

    private int age;

    private int yearOfBirth;

    private int salary;

    private Employee employee;

    public Employee (String name, char sex, int age, int yearOfBirth, int salary){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setEmployee(String name, char sex, int age, int yearOfBirth, int salary) {
        this.employee = new Employee(name, sex, age, yearOfBirth, salary);
    }

    public Employee getEmployee() {
        return employee;
    }

    public boolean isSameName(Employee employee){
        if(getName().equals(getEmployee())){
            return true;
        }else {
            return false;
        }
    }

    public int getSalary() {
        return salary;
    }
}
