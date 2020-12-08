import java.util.ArrayList;

public class JustTest {

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1); // Возвращаем подстроку s, которая начиная с нулевой позиции переданной строки (0) и заканчивается позицией символа (pos), который мы хотим удалить, соединенную с другой подстрокой s, которая начинается со следующей позиции после позиции символа (pos + 1), который мы удаляем, и заканчивается последней позицией переданной строки.
    }

    public static String toJadenCase(String phrase) {
        if(phrase == null || phrase.equals("")) return null;

        char[] array = phrase.toCharArray();

        for(int x = 0; x < array.length; x++) {
            if(x == 0 || array[x-1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }

    public static void main(String[] args) {
        ArrayList<String> lol = new ArrayList<String>();
        lol.add("abc ");
        lol.add("kek");
        lol.listIterator(0).toString().charAt(0);
        char f = 'a';
        String ff = "abc";
        System.out.println(ff.equals(String.valueOf(f)));
        System.out.println(lol.listIterator(0).next().charAt(0));
        System.out.println(Character.toString(f).equals(" "));
        System.out.println(Character.toString(f));

        lol.set(0, lol.listIterator(0).next().substring(0, 1).toUpperCase() + lol.listIterator(0).next().substring(1));
        lol.set(1, lol.listIterator(1).next().substring(0, 1).toUpperCase() + lol.listIterator(1).next().substring(1));
        //lol.listIterator(0).set(lol.listIterator(0).next().substring(0,1).toUpperCase()+lol.listIterator(0).next().substring(1));
        System.out.println(lol);

        String myName = "every body dance now";
        /*myName = myName.substring(0, 1).toUpperCase() + myName.substring(1);
        myName = myName.substring(0, myName.length() - 1);
        System.out.println(myName);*/

        System.out.println(toJadenCase(myName));
    }

}
