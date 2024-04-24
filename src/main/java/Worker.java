public class Worker extends Employee{

    private double monthlyPayment;

    public Worker(String name, String jobTitle, double monthlyPayment) {
        super(name, jobTitle);
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public double calculateMonthlySalary() {
        return monthlyPayment;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
