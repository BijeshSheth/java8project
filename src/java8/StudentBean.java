package java8;

import java.util.List;
import java.util.Objects;

public class StudentBean {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private String city;
    private int rank;
    private List<String> contacts;

    public StudentBean(int id, String name, int age, String gender, String department, String city, int rank, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentBean that = (StudentBean) o;
        return id == that.id && age == that.age && rank == that.rank && Objects.equals(name, that.name) && Objects.equals(gender, that.gender) && Objects.equals(department, that.department) && Objects.equals(city, that.city) && Objects.equals(contacts, that.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, department, city, rank, contacts);
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }
}
