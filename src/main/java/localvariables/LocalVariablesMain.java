package localvariables;

public class LocalVariablesMain {
//Itt ez nem fut le:
//var varialasMetodusonKivul = true; System.out.println(varialasMetodusonKivul );


    public static void main(String[] args) {

        boolean b = false;
        System.out.println(b);

        int a = 2;
        int i = 3 , j= 4;
        int k= i;

        //nem sikerül:
        //System.out.println(definialatlanValtozo);

        String s = "Hello World";

        //új blokk x változóval, x és a blokkon kívül definiált, de a kiírást tartalmazó blokkon belül, a blokk előtt definiált "a" változó kiírható:
        {int x = 0;
            System.out.println(x);
            System.out.println(a);}

        //blokkon kívül nem lehet kiíratni x-et:
        //System.out.println(x);




        //var kipróbálása main() metóduson belül

        var varialas = true;
        System.out.println(varialas);



    }

}
