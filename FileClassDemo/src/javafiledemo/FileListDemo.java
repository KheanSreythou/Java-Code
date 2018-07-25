package javafiledemo;

import java.io.File;

public class FileListDemo {
    public static void main(String[]args){
        File f=null;
        String[] paths;
        //create new file
        f=new File("C:\\Users\\Admin\\Desktop\\Example");
        //array of files and directory
        paths=f.list();
        //for each name in the path array
        for(String path:paths){
            //prints filename and directory name
            System.out.println(path);
        }
    }
}
