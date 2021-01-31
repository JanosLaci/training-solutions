package exam02;

import java.io.InputStream;

public class LottoReaderMain {
    public static void main(String[] args) {

        InputStream myInputStream = LottoReader.class.getResourceAsStream("otos.csv");
        LottoReader myLottoReader = new LottoReader(myInputStream);

        int numberToPrint = myLottoReader.getNumber(1);
        System.out.println(numberToPrint);
    }
}
