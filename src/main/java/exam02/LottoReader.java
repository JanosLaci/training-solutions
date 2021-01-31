package exam02;

//Senior feladatok: Fájlkezelés - lottószámok
//Az src/test/resources
// mappában találsz egy otos.csv fájlt
// (ez egyébként a https://bet.szerencsejatek.hu/jatekok/otoslotto/sorsolasok címről tölthető le),
// és olvasd be. Tárold el, hogy melyik számot hányszor húzták ki.
// A fájl pontosvesszővel (;) elválasztva tárolja a mezőket.
// A 12 - 16. mező (nullával indexelve 11 - 15) tárolja a kihúzott számokat.
//Írj egy LottoReader osztályt! Használj egy 90 elemű tömb attribútumot! Vigyázz, a 90-es szám a tömb 89. eleme.
//Konstruktorban töltsd be a fájlt, ami paraméterként egy InputStream-et vár.
// Mivel a fájl folytonosan frissül a megadott webhelyen és így a tesztesetek konkrét várt értékei is változhatnak,
// a mellékelt fájl alapján dolgozz!
//Megj.: A file elérési útvonala: src/main/resources/exam02/otos.csv

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LottoReader {

    int[] number = new int[90];
    InputStream inputStream;

    public LottoReader(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public int getNumber(int inputNumber) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] txtLineArrayBySemicolons = Arrays.copyOfRange(line.split(";"), 11, 16);

                for (String textItem : txtLineArrayBySemicolons) {
                    int drawnNumber = (Integer.parseInt(textItem));
                    number[drawnNumber - 1] += 1; } } }

        catch (IOException ioe) { throw new IllegalStateException("Cannot read file.", ioe); }

        return number[inputNumber - 1];
    }

}
