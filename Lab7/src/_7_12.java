import java.util.Arrays;
import java.util.Scanner;

public class _7_12 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " number>");
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        int prev = Arrays.stream(arr).findFirst().getAsInt();
        //System.out.print(prev + " ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i] + " ");
            } else if (arr[i] == prev) {
                //prev = arr[i];
                continue;
            } else {
                System.out.print(arr[i] + " ");
                prev = arr[i];
            }
        }
    }
}
