package java8;

import java.util.Comparator;
import java.util.List;

public class NthSalaryFromList {

    static Employee getNthSalary(int nTh){
        List<Employee> empList = new Employee().getEmployees();
        return empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .reversed()).toList().get(nTh);
    }

    public static void main(String[] args) {

        System.out.println(getNthSalary(2));
    }

}
