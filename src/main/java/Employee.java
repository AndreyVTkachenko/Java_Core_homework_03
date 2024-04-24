public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "Сотрудник: " + name +  " с зарплатой: " + calculateMonthlySalary() + " рублей";
    }
}
