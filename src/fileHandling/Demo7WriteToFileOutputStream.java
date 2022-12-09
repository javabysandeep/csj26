package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7WriteToFileOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("hello-world.txt");
        System.out.println(file.createNewFile());

        FileOutputStream fileOutputStream = new FileOutputStream(file,true);

        byte[] bytes = {75,76,77,78,79,80};

        fileOutputStream.write(bytes);
        System.out.println("write operation successful");
        fileOutputStream.close();
    }
}
