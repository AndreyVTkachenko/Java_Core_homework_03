public class Freelancer extends Employee{

    private double hourlyPayment;

    public Freelancer(String name, String jobTitle, double hourlyPayment) {
        super(name, jobTitle);
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public double calculateMonthlySalary() {
        return 20.8 * 8 * hourlyPayment;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
