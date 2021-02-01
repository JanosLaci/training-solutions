package week14d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    void index() {

        //Csak kiírást lehet tesztelni? Kérdés: Hogyan lehet előállítani a teszteléshez a Map-et?
       //assertEquals(new Indexer().index(Arrays.asList("Adam", "Lujza", "Abraham")), Map.of({"A"= "["Adam", "Abraham"]", "L"=List.of("Lujza")});

        Map<Character,List<String>> myIndexerMap = new Indexer().index(Arrays.asList("Ádám", "Lujza", "Ábrahám"));
        assertEquals(myIndexerMap.toString(), "{Á=[Ádám, Ábrahám], L=[Lujza]}" );

    }
}
