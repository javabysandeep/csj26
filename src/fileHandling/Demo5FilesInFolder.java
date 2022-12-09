package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo5FilesInFolder {
    public static void main(String[] args) throws IOException {
        File folder = new File("src/array");
        System.out.println("is folder "+folder.isDirectory());
        String[] fileNames = folder.list();
        System.out.println("Total no. of files available in folder "+fileNames.length);

        for (String fileName:fileNames) {
            System.out.println(fileName);
        }

    }
}
