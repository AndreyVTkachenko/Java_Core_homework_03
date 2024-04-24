import java.util.Comparator;

public class JobTitleComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getJobTitle().compareTo(o2.getJobTitle());
    }
}
