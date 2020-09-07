import java.util.Arrays;
import java.util.Scanner;

public class _2_17 {
    public static void main(String[] args) {
        // Write an application that inputs three integers from the
        //user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
        //shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
        //representation of the average. So, if the sum of the values is 7, the average should be 2, not
        //2.3333….]

        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("Enter 1st val: ");
        arr[0] = in.nextInt();
        System.out.print("Enter 2nd val: ");
        arr[1] = in.nextInt();
        System.out.print("Enter 3rd val: ");
        arr[2] = in.nextInt();
        System.out.println("__________________");
        System.out.println("Sum = " + Arrays.stream(arr).sum());
        System.out.println("Average = " + (arr[0] + arr[1] + arr[2]) / Arrays.stream(arr).count());
        System.out.println("Min value = " + Arrays.stream(arr).min().getAsInt());
        System.out.println("Max value = " + Arrays.stream(arr).max().getAsInt());
    }
}
