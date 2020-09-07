import java.util.Scanner;

public class _2_15 {
    public static void main(String[] args) {
        //Write an application that asks the user to enter two integers, obtains them
        //from the user and prints their sum, product, difference and quotient (division). Use the techniques
        //shown in Fig. 2.7.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st val: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd val: ");
        int b = in.nextInt();
        in.close();//Я не знаю зачем это надо и не понимаю как работает класс Scanner
        System.out.println("__________________");
        System.out.println("Sum = " + a + b);
        System.out.println("Product = " + a * b);
        System.out.println("Difference = " + (a - b));
        if (b == 0) {
            System.out.println("2nd value is null or 0");
        } else {
            System.out.println("sssDivision = " + a / b);
        }
    }
}
