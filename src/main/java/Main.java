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

        Employee employee0 = new Worker("Example_01", "developer", 100_000);
        Employee employee1 = new Worker("Example_02", "tester", 90_000);
        Employee employee2 = new Worker("Example_03", "analyst", 105_000);

        Employee employee3 = new Freelancer("Example_04", "developer",750);
        Employee employee4 = new Freelancer("Example_05", "tester", 725);
        Employee employee5 = new Freelancer("Example_06", "developer", 730);

        List<Employee> employees = new ArrayList<>();

        employees.add(employee0);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
