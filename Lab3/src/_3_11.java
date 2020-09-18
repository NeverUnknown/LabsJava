class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        } else
            System.out.println("Wrong balance !");
    }

    public Account(){
        name="unknown";
        balance=0.0;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double withdrawMoney) {
        if(withdrawMoney>balance){
            System.out.println("Withdrawal amount exceeded account balance.");
        }
        else{
            balance-=withdrawMoney;
        }
    }
}

public class _3_11 {
    public static void main(String[] args) {
        Account first = new Account("Slark", 75.2);
        Account second=new Account("Ken",285.99);

        System.out.println(first.getBalance());
        System.out.println(first.getName());
        first.deposit(20);
        System.out.println(first.getBalance());
        first.withdraw(95.2);
        System.out.println(first.getBalance());
        first.withdraw(100);
    }
}
