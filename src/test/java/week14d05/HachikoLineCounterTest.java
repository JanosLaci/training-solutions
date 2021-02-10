package week14d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HachikoLineCounterTest {


    @Test
    public void lineCounterTest(){

        assertEquals(3635,
                new HachikoLineCounter().
                        countWords(Path.
                                of("src/main/resources/week14d05/hachiko.srt"),
                                "").get(""));
    }

/*    @Test
    public void noStringInputTest(){
            assertThrows(IllegalStateException.class,
                    () ->

                    new HachikoLineCounter().
                    countWords(Path.
                                    of("src/main/resources/week14d05/hachiko.srt"),
                            ), );

        }*/







}
