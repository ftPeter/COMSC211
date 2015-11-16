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

public class ParseCSV {
    public String filename;
    public BufferedReader inputStream;

    public ParseCSV( String f ) {

        filename = f;
        try {
            inputStream = new BufferedReader(new FileReader(filename));
        } catch(IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    public boolean readyForBusiness() {
        return ( inputStream != null );
    }

    public void open() {
        // error if filename not defined
        // error if file does not exist
    }

    public String [] parseLine() {
        String [] temp = null;
        // error if file has not been opened
        try {
            String l;
            l = inputStream.readLine();
            if( l != null ) {
                //System.out.print(l.split(",")[0]);
                temp = l.split(",");
            } else {
                //System.out.println("EOF encountered");
                temp = null;
            }
        } catch(IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        return temp;
    }

    public void close() {
        // warn if file has not been opened
        try {
            if (inputStream != null) {
                inputStream.close();
            }
        } catch ( IOException x ) {
            System.err.format("IOException: %s%n", x);
        }
    }


    public static void main( String[] args) {
        System.out.println("Starting ParseCSV");
        // YOU WILL NEED TO UPDATE THIS LINE FOR YOUR MACHINE
        String filename = "/Users/peter/Google Drive/COMSC-211/Homework-Solutions/FilesExceptionsCSV/Spreadsheet.csv";

        ParseCSV parseObj = new ParseCSV(filename);
        String[] temp = parseObj.parseLine();
        while( temp != null ) {
            //System.out.print(temp.toString());
            String name = temp[0];
            System.out.println(name);
            temp = parseObj.parseLine();
        }
        parseObj.close();

    }
}
