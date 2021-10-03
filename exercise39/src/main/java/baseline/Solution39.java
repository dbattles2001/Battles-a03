package baseline;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Solution39 {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("John", "Johnson", "Manager", "2016-12-31"),
        new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
        new Employee("Jake", "Jacobson", "Programmer", ""),
        new Employee("Jacquelin", "Jackson", "DBA", ""),
        new Employee("Sally", "Weber", "Web Developer", "2015-12-18"),
        new Employee("Tou", "Xiong", "Software Engineeer", "2016-10-05")
        };

        List<Employee> list = Arrays.asList(employees);

        System.out.println("Name                      | Position           | Separation date");
        System.out.println("--------------------------|--------------------|----------------");

        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

        list.stream().sorted(lastThenFirst).forEach(System.out::println);
    }
}
