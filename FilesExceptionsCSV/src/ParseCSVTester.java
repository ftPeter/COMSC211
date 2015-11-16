/**
 * Created by Peter F. Klemperer on 11/15/15.
 *
 * Parsed from Oracle Character Streams tutorial
 * https://docs.oracle.com/javase/tutorial/essential/io/charstreams.html
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class ParseCSVTester {
    // YOU WILL NEED TO UPDATE THIS LINE FOR YOUR MACHINE
    String filename = "/Users/peter/hearthstone_deck_builder/full_card_list.csv";

    @Test
    public void testParseCSVConstructor() throws Exception {
        ParseCSV test = new ParseCSV(filename);
        assertNotNull("couldn't create ParseCSV object", test);
        assertTrue("ParseCSV couldn't open file", test.readyForBusiness());
    }
}
