package javafiledemo;

import java.io.File;

public class LengthFileDemo {
    public static void main(String[]args){
        File f=null;
        String path;
        long len;
        boolean bool=false;
       
        f=new File("C:\\Users\\Admin\\Desktop\\Example");
        //true if the file path is a file, else false
        bool=f.exists();
        //if path exists
        if(bool){
            //returns the length in bytes
            len=f.length();
            //path
            path=f.getPath();
            System.out.println(path+" file length: "+len);
        }
    }
}
