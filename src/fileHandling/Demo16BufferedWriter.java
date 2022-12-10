package fileHandling;

import java.io.*;
import java.time.LocalDateTime;

public class Demo16BufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("sourceFile.txt");
        System.out.println("is file created "+file.createNewFile());
        FileWriter fileWriter = new FileWriter(file,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("Write operation started at "+startTime);
        for (int i = 0; i < 10000000; i++) {
            bufferedWriter.write("file handling is in progress...");
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Write operation completed at "+endTime);

        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Write operation complete and stream is closed");
    }
}
