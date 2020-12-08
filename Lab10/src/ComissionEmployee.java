public class ComissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                             double grossSales, double commissionRate, int month, int day, int year) {

        super(firstName, lastName, socialSecurityNumber, month, day, year);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0.0f && commissionRate < 1.0f) {
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException("Commission rate must be > 0.0f and < 1.0f");
        }
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0.0f) {
            this.grossSales = grossSales;
        } else {
            throw new IllegalArgumentException("Gross sales muse be >= 0.0f");
        }
    }

    public double getGrossSales() {
        return this.grossSales;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: %,.2f$; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}