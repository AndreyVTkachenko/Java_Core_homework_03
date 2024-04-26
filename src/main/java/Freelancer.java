public class Freelancer extends Employee{

    private double hourlyPayment;

    public Freelancer(String firstName, String lastName, String jobTitle, double hourlyPayment) {
        super(firstName, lastName, jobTitle);
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public double calculateMonthlySalary() {
        return 20.8 * 8 * hourlyPayment;
    }

    @Override
    public String toString() {
        return "Фрилансер: " + firstName + " " + lastName + " на должности: "
                + jobTitle + " с зарплатой: " + calculateMonthlySalary() + " рублей";
    }
}
