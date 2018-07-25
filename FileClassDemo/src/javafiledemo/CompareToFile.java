package javafiledemo;

import java.io.File;

public class CompareToFile 
{
    public static void main(String[]args)
    {
        File f=null;
        File f1=null;
        
        f=new File("C:\\Users\\Admin\\Desktop\\Example\\Examplea.txt");
        f1=new File("C:\\Users\\Admin\\Desktop\\Example\\Exampleb.txt");
        //returns integer value
        int value=f.compareTo(f1);
        System.out.println("Lexicographically, abstract path name Example.txt");
        //if lexicographically, argument = abstract path name
        if(value==0)
        {
            System.out.println(" = ");
        }
        //if lexicographically, argument > abstract path name
        else if(value>0)
        {
            System.out.println(" > ");
        }
        //if lexicographically, the argument > abstract path name
        else
        {
            System.out.println(" < ");
        }
        System.out.println("Abstract path name Example1.txt");
        //prints the value returned by compareTo()
        System.out.println("Value returned: "+value);     
    }
}
