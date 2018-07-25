package javafiledemo;

import java.io.File;

public class GetNameDemo {
    public static void main(String[]args){
        File f=null;
        File f1=null;
        String v,v1;
        boolean bool=false;
        //create new files
        f=new File("C:\\Users\\Admin\\Desktop\\Example\\Apple .txt");
        f1=new File("C:\\Users\\Admin\\Desktop\\Example");
        //get file name or directory name
        v=f.getName();
        v1=f1.getName();
        //true if the file path exists
        bool=f.exists();
        //if file exists
        if(bool){
            System.out.println("File name: "+v);
        }
        //true if the directory exists
        bool=f1.exists();
        //if the folder exists
        if(bool){
            System.out.println("Folder name: "+v1);
        }
    }
}
