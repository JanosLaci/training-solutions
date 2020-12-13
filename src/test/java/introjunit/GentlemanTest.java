package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void testSayHello(){
        String inputName = "John Doe";
        Gentleman myGentleman = new Gentleman();

        //Hogyan lehet a null esetet ellenőrizni? Mit ír ki?

        assertEquals("Hello John Doe", myGentleman.sayHello(inputName) );

    }


}
