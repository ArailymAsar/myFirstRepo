package task6;

public class SalaryUtils {
    /*
    Необходимо создать класс SalaryUtils с единственным методом - getSum(Employee[] employeeArray),
    метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
     */

    public int getSum(Employee[] employeeArray){
        int sumSalary = 0;
        for (int i = 0; i < employeeArray.length; i++){
            sumSalary = employeeArray[i].getEmployee().getSalary();
        }
        return sumSalary;
    }
}
