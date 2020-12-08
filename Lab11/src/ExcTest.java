public class ExcTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("ExceptionA");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new ExceptionB("ExceptionB");
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new ExceptionC("ExceptionC");
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }
    }
}