public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.p and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return super.toString() + "Commission Employee -> [" +
                "Gross Sales = " + grossSales +
                ", Commission Rate = " + commissionRate +
                "]\n";
    }
}