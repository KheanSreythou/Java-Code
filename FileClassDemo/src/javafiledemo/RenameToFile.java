package javafiledemo;

import java.io.File;

public class RenameToFile {
    public static void main(String[] args){
        File f=null;
        File f1=null;
        boolean bool=false;
        f=new File("C:\\Users\\Admin\\Desktop\\Example\\New folder\\Apple .txt");
        f1=new File("C:\\Users\\Admin\\Desktop\\Example\\Apple .txt");
        bool=f.renameTo(f1);
        System.out.println("File renamed? "+bool);                 
    }
}