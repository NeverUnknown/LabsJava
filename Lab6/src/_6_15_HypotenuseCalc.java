public class _6_15_HypotenuseCalc {
    public static void main(String[] args) {
        System.out.println("Side 1 = 3.0\n"+"Side 2 = 4.0\n"+"Hypotenuse = "+calculations(3.0,4.0));
        System.out.println("\nSide 1 = 5.0\n"+"Side 2 = 12.0\n"+"Hypotenuse = "+calculations(5.0,12.0));
        System.out.println("\nSide 1 = 8.0\n"+"Side 2 = 15.0\n"+"Hypotenuse = "+calculations(8.0,15.0));
    }
    public static double calculations(double a,double b){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
}

