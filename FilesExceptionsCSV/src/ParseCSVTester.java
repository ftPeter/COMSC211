/**
 * Created by peter on 11/15/15.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class ParseCSVTester {
    String filename = "/Users/peter/hearthstone_deck_builder/full_card_list.csv";

    @Test
    public void testParseCSVConstructor() throws Exception {
        ParseCSV test = new ParseCSV(filename);
        assertNotNull("couldn't create ParseCSV object", test);
        assertTrue("ParseCSV couldn't open file", test.readyForBusiness());
    }
}
