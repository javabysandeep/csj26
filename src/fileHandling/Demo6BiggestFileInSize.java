package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo6BiggestFileInSize {
    public static void main(String[] args) throws IOException {
        File folder = new File("src/array");
        File[] files = folder.listFiles();
        File biggestFile = files[0];
        for (File file:files) {
            if(biggestFile.length() < file.length()){
                biggestFile = file;
            }
            System.out.println(file.getName()+"\t"+file.length());
        }

        System.out.println("Biggest file is "+biggestFile.getName()+"\t"+biggestFile.length());
    }
}
