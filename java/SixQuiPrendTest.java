
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SixQuiPrendTest {

    @Test
    public void notMultiple() {
        assertEquals(1, SixQuiPrend.findNumberOfBullHeads(1));
        assertEquals(1, SixQuiPrend.findNumberOfBullHeads(2));
    }

    @Test
    public void multipleOf5() {
        assertEquals(2, SixQuiPrend.findNumberOfBullHeads(5));
        assertEquals(2, SixQuiPrend.findNumberOfBullHeads(15));
        assertEquals(2, SixQuiPrend.findNumberOfBullHeads(25));
    }

    @Test
    public void multipleOf10() {
        assertEquals(3, SixQuiPrend.findNumberOfBullHeads(10));
        assertEquals(3, SixQuiPrend.findNumberOfBullHeads(50));
    }

    @Test
    public void multipleOf11() {
        assertEquals(5, SixQuiPrend.findNumberOfBullHeads(11));
        assertEquals(5, SixQuiPrend.findNumberOfBullHeads(44));
    }

    @Test
    public void value55() {
        assertEquals(7, SixQuiPrend.findNumberOfBullHeads(55));
    }

    @Test

    public void value100() {
        assertEquals(3, SixQuiPrend.findNumberOfBullHeads(100));
    }
}
