import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {

        Employee employee0 = new Worker("Иван", "Карамазов", "developer", 100_000);
        Employee employee1 = new Worker("Анна", "Каренина", "tester", 90_000);
        Employee employee2 = new Worker("Евгений", "Онегин", "analyst", 105_000);
        Employee employee6 = new Worker("Елизавета", "Гафтон", "designer", 95_000);
        Employee employee7 = new Worker("Федор", "Карамазов", "developer", 102_500);
        Employee employee8 = new Worker("Соня", "Мармеладова", "designer", 100_000);
        Employee employee9 = new Worker("Лев", "Мышкин", "developer", 97_500);
        Employee employee10 = new Worker("Варвара", "Ставрогина", "tester", 95_000);

        Employee employee3 = new Freelancer("Пьер", "Безухов", "developer",750);
        Employee employee4 = new Freelancer("Родион", "Раскольников", "tester", 725);
        Employee employee5 = new Freelancer("Андрей", "Болконский", "developer", 730);

        List<Employee> employees = new ArrayList<>();

        employees.add(employee0);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);

        System.out.println("список всех сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        Comparator<Employee> byFirstName = Comparator.comparing(Employee::getFirstName);
        employees.sort(byFirstName);
        System.out.println("сортировка по имени: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        Comparator<Employee> byLastName = Comparator.comparing(Employee::getLastName);
        employees.sort(byLastName);
        System.out.println("сортировка по фамилии: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        Comparator<Employee> byJobTitle = Comparator.comparing(Employee::getJobTitle);
        employees.sort(byJobTitle);
        System.out.println("сортировка по должности: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        Comparator<Employee> byMonthlyPayment = Comparator.comparing(Employee::calculateMonthlySalary);
        employees.sort(byMonthlyPayment);
        System.out.println("сортировка по зарплате: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
