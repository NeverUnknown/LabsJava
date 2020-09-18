import java.util.Scanner;

public class _2_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st val: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd val: ");
        int b = in.nextInt();
        in.close();
        if (a > b) {
            System.out.println("First value is larger");
        } else if (a < b) {
            System.out.println("Second value is larger");
        } else {
            System.out.println("These values are equal");
        }
    }
}
