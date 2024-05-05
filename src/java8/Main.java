package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<StudentBean> list = getData();

        // Find the list of students whose rank between 50 to 100
        List<StudentBean> stList = list.stream().filter(student -> student.getRank() >50 && student.getRank()<100).collect(Collectors.toList());
        System.out.println(stList);

        // Find the Student who stay in Newyork and sorting by name
        List<StudentBean> stList1 = list.stream().filter(studentBean -> studentBean.getCity().equals("New York"))
                .sorted(Comparator.comparing(StudentBean::getName))
                .collect(Collectors.toList());
        System.out.println(stList1);

        // FInd the all department name with Sorting
        List<String> stList2 = list.stream().map(StudentBean::getDepartment).distinct().sorted().collect(Collectors.toList());
        Set<String> stList3 = list.stream().map(StudentBean::getDepartment).sorted().collect(Collectors.toSet()); // get only unique department name
        System.out.println(stList2);

        // Get the Constant number in list or String
        List <List<String>> stList4= list.stream().map(StudentBean::getContacts).collect(Collectors.toList()); // Map : oneTOone
        List <String> stList5= list.stream().flatMap(StudentBean -> StudentBean.getContacts().stream()) .collect(Collectors.toList()); // FlatMap : One to many
        System.out.println(stList5);

        // Group the student department wise

        Map<String, List<StudentBean>> stList6= list.stream().collect(Collectors.groupingBy(StudentBean::getDepartment));
        System.out.println(stList6);

        // Group the student department wise count
        Map<String, Long> stList7= list.stream().collect(Collectors.groupingBy(StudentBean::getDepartment, Collectors.counting()));
        System.out.println(stList7);

        // Group the student department wise max count
        Map.Entry<String, Long> stList8= list.stream()
                .collect(Collectors.groupingBy(StudentBean::getDepartment, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stList8);

        // Find the average age of male and female student
        Map<String, Double> stList9= list.stream().collect(Collectors.groupingBy(StudentBean::getGender, Collectors.averagingInt(StudentBean::getAge)));
        System.out.println(stList9);

        // find the min rank from each department

        Map <String, Optional<StudentBean>> stList10= list.stream()
                .collect(Collectors.groupingBy(StudentBean::getDepartment, Collectors.minBy(Comparator.comparing(StudentBean::getRank))));
        System.out.println(stList10);

        // Find the second number
        StudentBean st11 = list.stream().sorted(Comparator.comparing(StudentBean::getRank)).skip(1).findFirst().get();
        System.out.println(st11);
    }

    private static List<StudentBean> getData(){
        List<String> contacts1 = Arrays.asList("1234567890", "john@example.com");
        List<String> contacts2 = Arrays.asList("0987654321", "jane@example.com");
        List<String> contacts3 = Arrays.asList("9876543210", "bob@example.com");
        List<String> contacts4 = Arrays.asList("4567890123", "alice@example.com");
        List<String> contacts5 = Arrays.asList("3210987654", "david@example.com");
        List<String> contacts6 = Arrays.asList("7890123456", "emily@example.com");
        List<String> contacts7 = Arrays.asList("2345678901", "sarah@example.com");
        List<String> contacts8 = Arrays.asList("8901234567", "michael@example.com");
        List<String> contacts9 = Arrays.asList("5678901234", "olivia@example.com");
        List<String> contacts10 = Arrays.asList("0123456789", "adam@example.com");
        List<String> contacts11 = Arrays.asList("4321098765", "chris@example.com");
        List<String> contacts12 = Arrays.asList("2109876543", "lisa@example.com");
        List<String> contacts13 = Arrays.asList("6789012345", "rachel@example.com");
        List<String> contacts14 = Arrays.asList("9012345678", "steven@example.com");
        List<String> contacts15 = Arrays.asList("3456789012", "julia@example.com");

        StudentBean student1 = new StudentBean(1, "John Doe", 20, "Male", "Computer Science", "New York", 10, contacts1);
        StudentBean student2 = new StudentBean(2, "Jane Smith", 22, "Female", "Engineering", "Los Angeles", 20, contacts2);
        StudentBean student3 = new StudentBean(3, "Bob Johnson", 21, "Male", "Mathematics", "Chicago", 30, contacts3);
        StudentBean student4 = new StudentBean(4, "Alice Brown", 23, "Female", "Physics", "San Francisco", 40, contacts4);
        StudentBean student5 = new StudentBean(5, "David Wilson", 19, "Male", "Biology", "Boston", 15, contacts5);
        StudentBean student6 = new StudentBean(6, "Emily Davis", 20, "Female", "Chemistry", "New York", 60, contacts6);
        StudentBean student7 = new StudentBean(7, "Sarah Lee", 22, "Female", "Economics", "New York", 27, contacts7);
        StudentBean student8 = new StudentBean(8, "Michael Clark", 21, "Male", "Computer Science", "Philadelphia", 38, contacts8);
        StudentBean student9 = new StudentBean(9, "Olivia Martinez", 24, "Female", "English", "Phoenix", 90, contacts9);
        StudentBean student10 = new StudentBean(10, "Adam Rodriguez", 20, "Male", "Sociology", "Denver", 10, contacts10);
        StudentBean student11 = new StudentBean(11, "Chris Thomas", 22, "Male", "Psychology", "Dallas", 51, contacts11);
        StudentBean student12 = new StudentBean(12, "Lisa Hall", 23, "Female", "Anthropology", "Miami", 72, contacts12);
        StudentBean student13 = new StudentBean(13, "Rachel White", 21, "Female", "Geography", "Atlanta", 1, contacts13);
        StudentBean student14 = new StudentBean(14, "Steven Garcia", 22, "Male", "Philosophy", "Detroit", 144, contacts14);
        StudentBean student15 = new StudentBean(15, "Julia Nguyen", 20, "Female", "Computer Science", "New York", 95, contacts15);

        return Stream.of(student1, student2, student3, student4, student5, student6,
                student7, student8, student9, student10, student11, student12, student13, student14,
                student15).toList();
    }
}
