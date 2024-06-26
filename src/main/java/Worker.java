public class Worker extends Employee{

    private double monthlyPayment;

    public Worker(String firstName, String lastName, String jobTitle, double monthlyPayment) {
        super(firstName, lastName, jobTitle);
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public double calculateMonthlySalary() {
        return monthlyPayment;
    }

    @Override
    public String toString() {
        return "Работник: " + firstName + " " + lastName + " на должности: "
                + jobTitle + " с зарплатой: " + calculateMonthlySalary() + " рублей";
    }


}
