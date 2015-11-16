/**
 * Created by Peter F. Klemperer on 11/15/15.
 *
 * Parsed from Oracle Character Streams tutorial
 * https://docs.oracle.com/javase/tutorial/essential/io/charstreams.html
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBytes {

    public static void main( String [] args) {
        System.out.println("Starting ReadBytes");
        String filename = "/Users/peter/Google Drive/COMSC-211/Homework-Solutions/FilesExceptionsCSV/Spreadsheet.csv";

        FileReader inputStream = null;

        try {
            inputStream = new FileReader(filename);

            int c;
            while ((c = inputStream.read()) != -1) {

                System.out.print(Character.toChars(c));
            }
        } catch(IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
