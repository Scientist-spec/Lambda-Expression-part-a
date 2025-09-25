import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 50000));
        employees.add(new Employee("Alice", 25, 45000));
        employees.add(new Employee("Bob", 35, 60000));
        employees.add(new Employee("Carol", 28, 55000));
        
        System.out.println("Original List:");
        employees.forEach(System.out::println);
        
        System.out.println("\nSorted by Name (Alphabetically):");
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        employees.forEach(System.out::println);
        
        System.out.println("\nSorted by Age (Ascending):");
        employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        employees.forEach(System.out::println);
        
        System.out.println("\nSorted by Salary (Ascending):");
        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        employees.forEach(System.out::println);
        
        System.out.println("\nSorted by Salary (Descending):");
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        employees.forEach(System.out::println);
    }
}
