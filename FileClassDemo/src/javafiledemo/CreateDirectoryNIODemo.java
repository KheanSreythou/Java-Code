package javafiledemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryNIODemo {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Admin\\Desktop\\Example\\sum");
        //if directory exists?
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
                System.out.println("Created directory is successful.");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    
}
