package javafiledemo;

import java.io.File;
import java.io.IOException;

public class DeleteOnExitDemo {
    public static void main(String[]args){
       
        File f=null;
            
        try {
            //create temporary file
            f=File.createTempFile("tmp", ".txt");//prefix, suffix
            //prints absolute path
            System.out.println("File path: "+f.getAbsolutePath());
            //deletes file when the virtual machine terminate
            f.deleteOnExit();
                          
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }            
    }
}
