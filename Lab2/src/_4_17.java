import java.util.Scanner;

public class _4_17 {
    public static void main(String[] args) {
        System.out.println(Trips());
    }

    public static String Trips() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter kilometers >");
        int km = in.nextInt();
        System.out.print("Enter liters >");
        int liters = in.nextInt();
        int countOfTrips = 0;
        double result = 0;
        if (km != 0 || liters != 0) {
            result += (double) km / (double) liters;
            countOfTrips++;
        }
        if (km <= 0 || liters <= 0) {
            System.out.println("Wrong km or liters!!!");
            return "Km per liters: " + result + "\nCount of trips: " + countOfTrips + "\n______________________";
        }
        while (km != 0 || liters != 0) {
            System.out.print("Enter kilometers >");
            km = in.nextInt();
            System.out.print("Enter liters >");
            liters = in.nextInt();
            if (km <= 0 || liters <= 0) {
                break;
            }
            result += (double) km / (double) liters;
            countOfTrips++;
        }
        in.close();
        return "Km per liters: " + result + "\nCount of trips: " + countOfTrips + "\n______________________";
    }
}
