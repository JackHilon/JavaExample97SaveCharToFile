
package javaexample97savechartofile;

import java.io.*;


public class JavaExample97SaveCharToFile {

    
    public static void main(String[] args) {
        
        
        String dest = "destFile.txt";
        
        try{
            
            // create an object to translate unicode-char to code which applies
            // in this computer, and to move these chars as a stream-byte
            // to the file
            /*
            Convenience class for writing character files. The constructors
            of this class assume that the default character encoding and the
            default byte-buffer size are acceptable. To specify these values
            yourself, construct an OutputStreamWriter on a FileOutputStream.
            
            Whether or not a file is available or may be created depends upon
            the underlying platform. Some platforms, in particular, allow
            a file to be opened for writing by only one FileWriter
            (or other file-writing object) at a time. In such situations
            the constructors in this class will fail if the file involved
            is already open.
            
            FileWriter is meant for writing streams of characters. 
            For writing streams of raw bytes, consider using a FileOutputStream.
            */
            FileWriter fw = new FileWriter(dest);
            // If the file does not exist, it will be created
            // If the file exists, its content will be lost
            
            // characters will be written in the file
            char c ='+';
            char[] ca = {'1', '2', '3', '4'};
            String str = "He goes to the school.";
            
            //lineEndChar depends on the plattform
            String lineEnd = System.getProperty("line.separator");
            //String lineEnd = System.lineSeparator();
            System.out.println("[" + lineEnd + "]");
            
            // writing chars to the file
            fw.write('A');
            fw.write(lineEnd + "Hello world!!!!" + lineEnd);
            fw.write(c);
            fw.write(ca);
            fw.write(lineEnd);
            fw.write(str);
            fw.write(lineEnd);
            
            fw.close();
            
            
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        SecondWay.main();
        ThirdWay.main();
    }
    
}
