package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TrainerTest {

    @Test
    void testCreate() {

        //Given
        Trainer trainer = new Trainer("Pistike");

        //When
        String nameReturned = trainer.getName();

        //Then

        assertEquals("Pistike", nameReturned);
    }

    @Test
    void testUpperCase(){
            assertEquals("KLÁRIKA", new Trainer("Klárika").getNameUpperCase());
        }



}
