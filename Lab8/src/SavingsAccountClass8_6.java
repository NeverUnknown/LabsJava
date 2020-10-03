public class SavingsAccountClass8_6 {
    public static void main(String[] args) {
        SavingAccountClass saver1 = new SavingAccountClass(4, 2000);
        SavingAccountClass saver2 = new SavingAccountClass(4, 3000);

        System.out.println("Saver 1 monthly interest: " + saver1.getSavingBalance());
        System.out.println("Saver 2 monthly interest: " + saver2.getSavingBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 monthly interest: " + saver1.getSavingBalance());
        System.out.println("Saver 2 monthly interest: " + saver2.getSavingBalance());

        SavingAccountClass.modifyInterestRate(5);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 monthly interest: " + saver1.getSavingBalance());
        System.out.println("Saver 2 monthly interest: " + saver2.getSavingBalance());
    }

}

class SavingAccountClass {
    /*
     * 1. Создай класс SavingsAccount. Используй static переменную annualInterestRate чтобы хранить годовой интерес (%) для всех владельцев счетов.
     * Каждый object class хранит private instance variable которая называется savingsBalance которая указывает сумму которую человек вложил на хранение.
     * Предоставтье метод calculateMonthlyInterest чтобы посчитал месячный интерес (%) умножая savingsBalance на annualInterestRate и делить на 12 - этот
     * интерес (%) должен быть прибавлен к savingsBalance. Предоставтье static метод modifyInterestRate который устанавлиает annualInterestRate на новое значение (value).
     * Напишите программу для того чтобы протестить class SavingsAccount. Создайте экземпляр на 2 savingsAccount objects которые будут называться saver1 и saver2,
     * с балансом $2000 и $3000. Установи annualInterestRate к значени 4%, потом посчитай месячный интерес (%) на каждый месяц в течении 12 месяцев и выведи новый балланс счета
     * для двух накопительных счетов.
     * Потом, сделай annualInterestRate значение 5% и посчитай интерес на следующий месяц и выведи опять балланс двух счетов.*/
    static double annualInterestRate;
    private double savingBalance;

    SavingAccountClass(double annualInterestRate, double savingBalance) {
        if (annualInterestRate > 0 && savingBalance > 0) {
            SavingAccountClass.annualInterestRate = annualInterestRate;
            this.savingBalance = savingBalance;
        }
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        if (savingBalance > 0) {
            this.savingBalance = savingBalance;
        } else {
            System.out.println("Wrong saving balance");
        }
    }

    public void calculateMonthlyInterest() {
        savingBalance += (savingBalance * annualInterestRate) / 12;
    }

    static void modifyInterestRate(double value) {
        SavingAccountClass.annualInterestRate = value;
    }
}
