import java.util.Scanner;

public class _2_16 {
    public static void main(String[] args) {
        //Write an application that asks the user to enter two integers, obtains
        //them from the user and displays the larger number followed by the words "is larger". If the numbers are equal, print the message
        // "These numbers are equal". Use the techniques shown in Fig. 2.15.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st val: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd val: ");
        int b = in.nextInt();
        in.close();
        if(a>b){
            System.out.println("First value is larger");
        }
        else if(a<b){
            System.out.println("Second value is larger");
        }
        else{
            System.out.println("These values ar equal");
        }
    }
}
