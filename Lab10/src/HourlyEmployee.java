public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double wage, double hours, int month, int day, int year) {

        super(firstName, lastName, socialSecurityNumber, month, day, year);
        setWage(wage);
        setHours(hours);
    }

    public void setWage(double wage) {
        if (wage >= 0.0f) {
            this.wage = wage;
        } else {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0f");
        }
    }

    public double getWage() {
        return this.wage;
    }

    public void setHours(double hours) {
        if ((hours >= 0.0f) && (hours <= 168.0f)) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Hours worked must be >= 0.0f and <= 16.0f");
        }
    }

    public double getHours() {
        return this.hours;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40) {
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5f;
        }
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s\n%s: %,.2f$; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
}