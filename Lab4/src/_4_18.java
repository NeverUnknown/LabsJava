import java.util.Scanner;

public class _4_18 {
    public static void main(String[] args) {
        CreditLimitCalculator test = new CreditLimitCalculator(1, 0, 0, 200, 1000);
        /*test.setTotalItemsCharged(500);
        test.setTotalItemsCharged(500);
        test.setTotalCreditsApplied(200);
        test.setTotalCreditsApplied(200);
        test.setTotalCreditsApplied(200);
        test.setTotalCreditsApplied(200);
        //test.setTotalCreditsApplied(200);
        test.setTotalCreditsApplied(0);
        test.setTotalItemsCharged(500);
        //test.calculate();*/
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1:Charge\n2:Apply\n3:End");
            int sw = in.nextInt();
            switch (sw) {
                case 1:
                    test.setTotalItemsCharged(in.nextInt());
                    break;
                case 2:
                    test.setTotalCreditsApplied(in.nextInt());
                    break;
                case 3:
                    exit = true;
                    test.getNewBalance();
                    break;
                default:
                    continue;
            }
        }
        in.close();
    }
    //Develop a Java application that determines whether any of several
    //department-store customers has exceeded the credit limit on a charge account. For each customer,
    //the following facts are available:
    //a) account number
    //b) balance at the beginning of the month
    //c) total of all items charged by the customer this month
    //d) total of all credits applied to the customer’s account this month
    //e) allowed credit limit.
    //The program should input all these facts as integers, calculate the new balance (= beginning balance + charges – credits),
    // display the new balance and determine whether the new balance exceeds the
    //customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
}

class CreditLimitCalculator {

    private int accountNumber;
    private double balBeginOfMonth;
    private double totalItemsCharged = 0;
    private double totalCreditsApplied = 0;
    private double allowedCreditLimit;
    private double newBalance;
    private boolean flag;

    CreditLimitCalculator(int accountNumber, double balBeginOfMonth, double totalItemsCharged, double totalCreditsApplied, double allowedCreditLimit) {
        setAccountNumber(accountNumber);
        setBalBeginOfMonth(balBeginOfMonth);
        setTotalItemsCharged(totalItemsCharged);
        setAllowedCreditLimit(allowedCreditLimit);
        setTotalCreditsApplied(totalCreditsApplied);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            this.accountNumber = 1;
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public double getBalBeginOfMonth() {
        return balBeginOfMonth;
    }

    public void setBalBeginOfMonth(double balBeginOfMonth) {
        if (accountNumber < 0) {
            this.balBeginOfMonth = balBeginOfMonth;
        } else {
            this.balBeginOfMonth = 0;
        }
    }

    public double getTotalItemsCharged() {
        return totalItemsCharged;
    }

    public void setTotalItemsCharged(double totalItemsCharged) {
        if (totalItemsCharged > 0) {
            this.totalItemsCharged += totalItemsCharged;
        }
    }

    public double getTotalCreditsApplied() {
        return totalCreditsApplied;
    }

    public void setTotalCreditsApplied(double totalCreditsApplied) {
        if (totalCreditsApplied > 0) {
            if (this.totalCreditsApplied + totalCreditsApplied < allowedCreditLimit + 1.0) {
                this.totalCreditsApplied += totalCreditsApplied;
                flag = true;
            } else {
                flag = false;
            }
        }
    }

    public double getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    public void setAllowedCreditLimit(double allowedCreditLimit) {
        if (allowedCreditLimit < 0) {
            this.allowedCreditLimit = 0;
        } else {
            this.allowedCreditLimit = allowedCreditLimit;
        }
    }

    /*public void calculate() {
        newBalance = balBeginOfMonth + totalItemsCharged - totalCreditsApplied;
    }*/

    public void getNewBalance() {
        //calculate();
        newBalance = balBeginOfMonth + totalItemsCharged - totalCreditsApplied;
        if (flag) {
            System.out.println("Beginning balance = " + balBeginOfMonth + "\nNew balance = " + newBalance + "\n+ Charges = " + totalItemsCharged + "\n- Credits = " + totalCreditsApplied);
        } else {
            System.out.println("Credit limit exceeded");
        }
    }
}
