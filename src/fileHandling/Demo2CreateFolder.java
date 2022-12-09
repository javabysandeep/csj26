package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo2CreateFolder {
    public static void main(String[] args) throws IOException {
        File directory = new File("directory1");
        boolean isDirectoryCreated = directory.mkdir();
        System.out.println(isDirectoryCreated);
    }
}
