import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        double salary1 = o1.calculateMonthlySalary();
        double salary2 = o2.calculateMonthlySalary();
        return Double.compare(salary1, salary2);
    }
}
