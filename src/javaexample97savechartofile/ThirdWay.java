package javaexample97savechartofile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ThirdWay {

    public static void main() {

        String dest3 = "destFile3.txt";

        try {
            /*
            A file output stream is an output stream for writing data to a 
            File or to a FileDescriptor. Whether or not a file is available or 
            may be created depends upon the underlying platform. 
            Some platforms, in particular, allow a file to be opened for 
            writing by only one FileOutputStream (or other file-writing object) 
            at a time. In such situations the constructors in this class 
            will fail if the file involved is already open.
            */
            FileOutputStream fos = new FileOutputStream(dest3);

            //OutputStreamWriter osw = new OutputStreamWriter(fos, "ASCII");
            /*
            Creates an OutputStreamWriter that uses the default character
            encoding.
            */
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            char[] charArray = {'@', '#', '%', '+', 'ä', 'å', 'ö', '×', '÷'};

            String end = System.getProperty("line.separator");

            osw.write('A');
            osw.write(end);
            osw.write(charArray);
            osw.write(end);
            osw.write("Hi! It is sunny today.");
            osw.write(end);

            osw.close();
            fos.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
