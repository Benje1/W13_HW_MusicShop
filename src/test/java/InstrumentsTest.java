import Instruments.Guitar;
import Instruments.Oboe;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

    Guitar guitar;
    Oboe oboe;
    Trumpet trumpet;

    @Before
    public void before() {
        guitar = new Guitar(6, 5000);
        oboe = new Oboe(6000);
        trumpet = new Trumpet(45000, 4);
    }

    @Test
    public void getNumberOfGuitarStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void getPriceOfGuitar() {
        assertEquals(5000, guitar.getPrice());
    }

    @Test
    public void getPriceOFOboe() {
        assertEquals(6000, oboe.getPrice());
    }

    @Test
    public void getPriceOfTrumpet() {
        assertEquals(45000, trumpet.getPrice());
    }

    @Test
    public void getNumberOfValues() {
        assertEquals(4, trumpet.getNumberOfValues());
    }

    @Test
    public void canGetSoundOUt() {
        assertEquals("*Musical note*", guitar.bePlayed());
    }
}
