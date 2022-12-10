package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo13FileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("file-writer.txt");
        System.out.println("File created "+file.createNewFile());
        FileWriter fileWriter = new FileWriter(file);
        System.out.println("Write operations started at "+LocalDateTime.now());
        for (int i = 0; i < 50000000; i++) {
            fileWriter.write("we use character oriented streams to write strings or characters");
        }
        fileWriter.close();
        System.out.println("Write operations completed at "+LocalDateTime.now());
    }
}
