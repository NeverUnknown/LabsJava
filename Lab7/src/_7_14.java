import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _7_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter count of values>");
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " value>");
            list.add(in.nextInt());
        }
        String pr = "";
        for (int i = 0; i < list.size(); i++) {
            pr += list.get(i).toString();
            if(i!=list.size()-1){
                pr+=",";
            }
        }
        System.out.println("Product of ("+pr+") is \""+product(list)+"\"");
        in.close();
    }

    public static int product(ArrayList<Integer> list) {
        int res = 1;
        for (int i = 0; i < list.size(); i++) {
            res *= list.get(i);
        }
        return res;
    }
}
