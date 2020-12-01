package array;

//Definiálj egy String tömböt a hét napjaival! Írd ki a második elemét (kedd)! Írd ki a tömb hosszát is!
//Definiálj egy öt elem hosszú int tömböt, és tárold le benne (ciklussal) a kettő hatványait (1, 2, 4, 8 stb.)! Ciklusban írd ki az értékeit!
//Definiálj egy hat elemű boolean tömböt, és felváltva írj bele true vagy false értéket, 0. index esetén legyen false! Ciklusban írd ki az elemeit!


public class ArrayMain {
    public static void main(String[] args) {

        String[] hetNapjai = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(hetNapjai[1] + " " + hetNapjai.length);

        int[] kettoHatvanyai = new int[5];

        for (int i = 0; i < 5; i++){
            kettoHatvanyai[i] = (int) Math.pow(2, i);
        }

        for (int negyzetSzam: kettoHatvanyai) {
            System.out.println(negyzetSzam);

        }

        boolean[] felvaltva = new boolean[6];

        for (int i = 0; i < 6; i++){
            if (i%2 == 0) {felvaltva[i] = false;}
            else {felvaltva[i] = true;}
        }

        for (boolean elem: felvaltva) {
            System.out.println(elem);

        }


    }
}
