import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    SheetMusic sheetMusic;
    TuningPegs tuningPegs;
    InstrumentStrings instrumentStrings;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic(170);
        tuningPegs = new TuningPegs(300);
        instrumentStrings = new InstrumentStrings(250, 'G');
    }

    @Test
    public void getPriceOfSheet() {
        assertEquals(170, sheetMusic.getPrice());
    }

    @Test
    public void getPriceOfTuningPeg() {
        assertEquals(300, tuningPegs.getPrice());
    }

    @Test
    public void getPriceOfString() {
        assertEquals(250, instrumentStrings.getPrice());
    }

    @Test
    public void getStringString() {
        assertEquals('G', instrumentStrings.getString());
    }
}
