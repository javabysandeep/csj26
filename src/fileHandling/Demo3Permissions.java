package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo3Permissions {
    public static void main(String[] args) throws IOException {
        File file = new File("abc071222.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println(isFileCreated);
        file.setReadOnly();
        System.out.println("permission set to read only");
    }
}
