package fileWriteRead;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;


/**
 * Created by Minoofam on 8/10/2019.
 */
public class Main {

    public static void main (String[] args) {
        File file = new File("C:\\ROOT\\Amir.txt");
        //file.mkdir();
        //file.mkdirs();
     //Write File
        try {
    FileWriter fileWriter = new FileWriter(file);
    fileWriter.write("haha\r\nhehe");
    fileWriter.close();
    } catch (IOException e) {
    e.printStackTrace ();
    }

//Read File
        try {
            FileReader fileReader = new FileReader(file);
            int ascii = fileReader.read();
            String content="";

            while (ascii!=-1)// not EoF: End of File
            {
                content+=(char) ascii;
                ascii = fileReader.read();
            }
            fileReader.close();
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
