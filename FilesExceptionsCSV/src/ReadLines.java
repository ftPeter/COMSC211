/**
 * Created by Peter F. Klemperer on 11/15/15.
 *
 * Parsed from Oracle Character Streams tutorial
 * https://docs.oracle.com/javase/tutorial/essential/io/charstreams.html
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadLines {
    public static void main(String[] args) throws IOException {

        // YOU WILL NEED TO UPDATE THIS LINE FOR YOUR MACHINE
        String filename = "/Users/peter/Google Drive/COMSC-211/Homework-Solutions/FilesExceptionsCSV/Spreadsheet.csv";

        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(filename));

            String l;
            while ((l = inputStream.readLine()) != null) {
                System.out.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
