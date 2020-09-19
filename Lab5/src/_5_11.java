import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class _5_11 {
    public static void main(String[] args) {
        System.out.print("Enter count of values: ");
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        in.close();
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((20 - 1) + 1) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i == arr.length - 1) {
                System.out.println();
            }
        }
        System.out.println("Min val: " + Arrays.stream(arr).min().getAsInt());
    }
}

