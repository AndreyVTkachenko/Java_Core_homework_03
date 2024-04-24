public class Worker extends Employee{

    private double monthlyPayment;

    public Worker(String name, double monthlyPayment) {
        super(name);
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public double calculateMonthlySalary() {
        return monthlyPayment;
    }
}
