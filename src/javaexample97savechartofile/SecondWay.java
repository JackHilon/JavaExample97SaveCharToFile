package javaexample97savechartofile;

import java.io.*;

public class SecondWay {
    
    
    // chars and string will be added to the end of the file rather than the beginning
    
    
    public static void main() {
        
        String dest2 = "destFile2.txt";
        
        try {
            FileWriter fw = new FileWriter(dest2, true);
            // true: the chars will be added to the end of the file rather than the beginning
            
            char[] charArray = {'@', '#', '%', '+'};
            String end = System.getProperty("line.separator");
            
            fw.write('A');
            fw.write(end);
            fw.write(charArray);
            fw.write(end);
            fw.write("Hi! It is sunny today.");
            fw.write(end);
            
            fw.close();
        } 
        catch (IOException e) {
            System.out.println(e.toString());
        } 
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
