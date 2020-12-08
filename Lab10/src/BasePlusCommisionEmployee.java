public class BasePlusCommisionEmployee extends ComissionEmployee {

    private double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                     double grossSales, double commissionRate, double baseSalary,
                                     int month, int day, int year) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, month, day, year);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double salary) {
        if (salary >= 0.0f) {
            baseSalary = salary;
        } else {
            throw new IllegalArgumentException("Base salary must be >= 0.0f");
        }
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: %,.2f$",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}