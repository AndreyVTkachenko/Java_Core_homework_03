public abstract class Employee {

    private String name;
    private String jobTitle;

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "Сотрудник: " + name + "\t на должности: " + jobTitle + "\t\t с зарплатой: " + calculateMonthlySalary() + " рублей";
    }
}
