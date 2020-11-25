package statements;

public class StatementMain {

    public static void main(String[] args) {

        int x = 5 + 6; int y = 11 - x, z = 8;
        boolean b = x > y, c = b || z > 5;
        z++;


        System.out.println(x + y + z);
        System.out.println("" + x + y + z);
        System.out.println(b);
        System.out.println(c);




    }


}
