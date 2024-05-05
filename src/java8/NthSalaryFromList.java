package java8;

import java.util.Comparator;
import java.util.List;

public class NthSalaryFromList {

    public static void main(String[] args) {
        List<Employee> empList = new Employee().getEmployees();
        Employee emp = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList().get(2);
        System.out.println(emp);
    }

}
