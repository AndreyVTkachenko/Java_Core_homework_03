public class Freelancer extends Employee{

    private double hourlyPayment;

    public Freelancer(String name, double hourlyPayment) {
        super(name);
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
