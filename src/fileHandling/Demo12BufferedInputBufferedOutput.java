package fileHandling;

import java.io.*;
import java.time.LocalDateTime;

public class Demo12BufferedInputBufferedOutput {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("sourceFile.txt");
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        File destinationFile = new File("destination.txt");
        System.out.println("destination file created " + destinationFile.createNewFile());
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //file copy operation
        System.out.println("File copy started at "+LocalDateTime.now());
        int data = bufferedInputStream.read();
        while (data != -1) {
            bufferedOutputStream.write(data);
            data = bufferedInputStream.read();
        }
        System.out.println("File copy completed at "+LocalDateTime.now());
        fileInputStream.close();
        fileOutputStream.close();

    }
}
