import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVImporter {

    //for this to work you need to:
    //File - Project Structure - Libraries - Add (Plus button) - From Maven
    //-type "com.opencsv", press enter to let results load, select first option
    //ok, ok, etc


    public static ArrayList<String []> importData(String filename){

        //attempt to run the code in the try section
        //-if anything crashes, the catch section will run instead
        try {
            FileReader fr = new FileReader(filename);
            CSVReader reader = new CSVReader(fr);
            //make an arraylist from the csv data
            //-each element is a row from the csv
            //-each row is a string array
            //-each element of the string array is a cell from the spreadsheet
            ArrayList<String []> data = new ArrayList<>(reader.readAll());
            return data;
        }
        catch (Exception e) {
            //print information about the error that caus3ed the try
            //section to crash
            e.printStackTrace();
        }

        return null;
    }
}
