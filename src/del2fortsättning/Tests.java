package del2fortsättning;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Tests {

    @Test
    public void testAddLineIncreasesAntalRader() {
        TextCheck textCheck = new TextCheck();

        textCheck.addLine("This is a line");
        textCheck.addLine("Another line");

        assertEquals(2, textCheck.getAntalRader(), "Antal raderd bör vara 2 efter att ha lagt till två rader");
    }


    @Test
    public void testAddLineIncreasesAntalBokstaver() {
        TextCheck textCheck = new TextCheck();

        textCheck.addLine("Hello");
        textCheck.addLine("World");

        assertEquals(10, textCheck.getAntalBokstaver(), "Antal bokstäver bör vara 10 (5 från 'Hello' och 5 från 'World')");
    }
    @Test
    public void testInitialState() {
        TextCheck textCheck = new TextCheck();

        assertEquals(0, textCheck.getAntalRader(), "Initialt bör antal rader vara 0");
        assertEquals(0, textCheck.getAntalBokstaver(), "Initialt bör antal bokstäver vara 0");
    }

}
