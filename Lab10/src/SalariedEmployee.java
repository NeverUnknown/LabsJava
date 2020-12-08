public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
                            double weeklySalary, int month, int day, int year) {

        super(firstName, lastName, socialSecurityNumber, month, day, year);
        setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >= 0.0f) {
            this.weeklySalary = weeklySalary;
        } else {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0f");
        }
    }

    public double getWeeklySalary() {
        return this.weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s\n%s: %,.2f$",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}