class ParkingCharges {
    private double time;
    private double tax;

    public ParkingCharges(double time) {
        setTime(time);
    }

    public void setTime(double time) {
        if (time > 0) {
            this.time = time;
        }
    }

    public double getTime() {
        return time;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public String toString(){
        return "__________\nTime: "+getTime()+"\nTax: "+getTax()+"\n----------";
    }

    public void calculateCharges() {
        if (time > 19) {
            setTax(10);
        } else if (time == 3) {
            setTax(2);
        } else if (time > 3) {
            double tempTimeTax = 0;
            double tempTime = time - 3;
            while (tempTime != 0.0 || (tempTime > -1.0 && tempTime < 0.0)) {
                if (tempTime > 0.0 && tempTime < 1.0) {
                    tempTimeTax += 0.5;
                    tempTime -= 1.0;
                    break;
                }
                if (tempTime >= 1.0) {
                    tempTimeTax += 0.5;
                    tempTime -= 1.0;
                }
                else {
                    break;
                }
            }
            setTax(2 + tempTimeTax);
        }
    }
}

public class _6_8 {
    public static void main(String[] args) {
        ParkingCharges test = new ParkingCharges(3.1);
        test.calculateCharges();
        System.out.println(test.toString());
    }
}
