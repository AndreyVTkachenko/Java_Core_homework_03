public abstract class Employee {

    String firstName;
    String lastName;
    String jobTitle;

    public Employee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "Сотрудник: " + firstName + " " + lastName + " на должности: "
                + jobTitle + " с зарплатой: " + calculateMonthlySalary() + " рублей";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
