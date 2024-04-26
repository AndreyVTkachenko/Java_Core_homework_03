/*
1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой
(один из потомков - Freelancer) и фиксированной оплатой (второй потомок -Worker). Далее:
а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы;
Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата»;
б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его;
в) ** Реализовать интерфейсы для возможности сортировки массива/коллекции (обратите ваше внимание на
интерфейсы Comparator, Comparable), добавьте новое состояние на уровне базового типа и создайте свой уникальный
компаратор;
г) ** Создать класс, содержащий массив или коллекцию сотрудников (как Worker, так и Freelancer), и реализовать
возможность вывода данных с использованием foreach (подсказка: вам потребуется поработать с интерфейсом Iterable).
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

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
        printEmployees(employees);
        System.out.println();

        employees.sort(new FirstNameComparator());
        System.out.println("сортировка по имени: ");
        printEmployees(employees);
        System.out.println();

        employees.sort(new LastNameComparator());
        System.out.println("сортировка по фамилии: ");
        printEmployees(employees);
        System.out.println();

        employees.sort(new JobTitleComparator());
        System.out.println("сортировка по должности: ");
        printEmployees(employees);
        System.out.println();

        employees.sort(new SalaryComparator());
        System.out.println("сортировка по зарплате: ");
        printEmployees(employees);

    }

    static void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
