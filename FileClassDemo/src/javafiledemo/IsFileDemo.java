package javafiledemo;

import java.io.File;

public class IsFileDemo {
    public static void main(String[]args){
        File f=null;
        String path;
        boolean bool=false;
       
        f=new File("C:\\Users\\Admin\\Desktop\\Example\\Apple .txt");
        //true if the file path is a file, else false
        bool=f.isFile();
        //get the path
        path=f.getPath();
        System.out.println(path+" is file? "+bool);       
    }
}
