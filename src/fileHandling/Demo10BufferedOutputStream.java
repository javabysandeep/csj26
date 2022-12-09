package fileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo10BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("sourceFile.txt");
        System.out.println("is file created "+file.createNewFile());
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("Write operation started at "+startTime);
        for (int i = 0; i < 10000000; i++) {
            bufferedOutputStream.write('A');
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Write operation completed at "+endTime);

        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("Write operation complete and stream is closed");
    }
}
