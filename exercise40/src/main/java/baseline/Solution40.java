package baseline;

import java.util.Scanner;

public class Solution40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee[] employees = {
                new Employee("John", "Johnson", "Manager", "2016-12-31"),
                new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"),
                new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"),
                new Employee("Jake", "Jacobson", "Programmer", ""),
                new Employee("Jacquelyn", "Jackson", "DBA", ""),
                new Employee("Sally", "Weber", "Web Developer", "2015-12-18")
        };

        System.out.print("Enter a name or part of the name you're looking for: ");
        String keyword = input.next();

        System.out.println("Name                      | Position           | Separation date");
        System.out.println("--------------------------|--------------------|----------------");

        for(Employee employee : employees) {
            if(employee.firstName.contains(keyword) || employee.lastName.contains(keyword))
                System.out.printf("%-12s %-12s | %-18s | %-12s%n",  employee.firstName, employee.lastName, employee.position, employee.separationDate);
        }
    }
}
