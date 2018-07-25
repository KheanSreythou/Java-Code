package javafiledemo;

import java.io.File;

public class ListDirectoryDemo {
    public static void main(String[] args){
       File dir=new File("C:\\Users\\Admin\\Desktop\\Example");
       listRecursive(dir);
    }
    public static void listRecursive(File dir){
        if(dir.isDirectory()){
            File[] items=dir.listFiles();
            for(File item:items){
                System.out.println(item.getAbsoluteFile());
                //if in the directory has another sub directory
                //if(item.isDirectory()) listRecursive(item); 
            }
        }
    }
}
