package javafiledemo;

import java.io.File;
import java.io.IOException;

public class FileDemo
{
   public static void main(String[] args) 
   {      
        File f = null;
        boolean bool = false;
        String v;
      
        try 
        {
            f = new File("C:\\Users\\Admin\\Desktop\\Example\\test.txt");
         
            // create new file in the system
            f.createNewFile();
            // pathname string from abstract pathname
            v = f.getPath();
         
            // tests if file exists
            bool = f.exists();
         
            // prints
            System.out.println("File exists: "+bool);
         
            if(bool == true) {
            // delete() invoked
            f.delete();
            System.out.println("delete() invoked");
        }
         
            
         // tests if file exists
         bool = f.exists();
         
         // prints
         System.out.print("File exists: "+bool);
         
        } 
        catch(IOException e)
        {
         // if any error occurs
        System.out.println(e.getMessage());
        }
    }
}