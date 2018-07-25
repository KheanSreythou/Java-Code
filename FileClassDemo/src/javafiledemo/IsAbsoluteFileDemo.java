package javafiledemo;

import java.io.File;

public class IsAbsoluteFileDemo {
    public static void main(String[]args){
        File f=null;
        String path;
        boolean bool=false;
       
        f=new File("C:\\Users\\Admin\\Desktop\\Example.txt");
        //true if the file path is absolute, else false
        bool=f.isAbsolute();
        //get the path
        path=f.getPath();
        System.out.println(path+" is absolute?\n"+bool);          
    }
}
