package java8;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;
    private String name;
    private String department;
    private int salary;
    private int age;

    public Employee() {

    }

    public Employee(int id, String name, String department, int salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                '}';
    }

    public List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "John Doe", "Engineering", 80000, 30));
        employeeList.add(new Employee(2, "Jane Smith", "Marketing", 70000, 28));
        employeeList.add(new Employee(3, "Bob Johnson", "Finance", 90000, 35));
        employeeList.add(new Employee(4, "Alice Brown", "Human Resources", 75000, 32));
        employeeList.add(new Employee(5, "David Wilson", "Sales", 85000, 29));
        return employeeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
