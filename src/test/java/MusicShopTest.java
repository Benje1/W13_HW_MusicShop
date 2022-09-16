import Instruments.Guitar;
import Instruments.Oboe;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    Guitar guitar;
    Oboe oboe;
    Trumpet trumpet;
    SheetMusic sheetMusic;
    TuningPegs tuningPegs;
    InstrumentStrings instrumentStrings;
    MusicShop musicShop;

    @Before
    public void before() {
        guitar = new Guitar(6, 5000);
        oboe = new Oboe(6000);
        trumpet = new Trumpet(45000, 4);
        sheetMusic = new SheetMusic(170);
        tuningPegs = new TuningPegs(300);
        instrumentStrings = new InstrumentStrings(250, 'G');
        musicShop = new MusicShop("CodeClanCGE");
    }

    @Test
    public void shopHasName() {
        assertEquals("CodeClanCGE", musicShop.getName());
    }

    @Test
    public void hasMoneyInTill() {
        assertEquals(50000, musicShop.getTill());
    }

    @Test
    public void StockStartsEmpty() {
        assertEquals(0, musicShop.getStock());
    }

    @Test
    public void shopCanAddToStock() {
        musicShop.addStock(guitar);
        assertEquals(1, musicShop.getStock());
    }

    @Test
    public void shopCanSell() {
        musicShop.addStock(guitar);
        assertEquals(guitar, musicShop.sellStock(guitar));
    }

    @Test
    public void shopDoesNotMaintainItemAfterSelling() {
        musicShop.addStock(guitar);
        musicShop.sellStock(guitar);
        assertEquals(0, musicShop.getStock());
    }

    @Test
    public void shopPaysForItemsItBuys() {
        musicShop.addStock(guitar);
        assertEquals(45000, musicShop.getTill());
    }

    @Test
    public void shopGetsPayedForSellingItems() {
        musicShop.addStock(guitar);
        musicShop.sellStock(guitar);
        assertEquals(50075, musicShop.getTill());
    }

    @Test
    public void canCalculateTotalled() {
        musicShop.addStock(guitar);
        musicShop.addStock(oboe);
        assertEquals(11175, musicShop.calculateTotalValueInShop());
    }
}
