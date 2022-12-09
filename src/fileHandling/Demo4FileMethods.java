package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo4FileMethods {
    public static void main(String[] args) throws IOException {
        File file = new File("abc071222.txt");
        System.out.println(file.getAbsolutePath());//complete path
        System.out.println(file.getPath());//path in the current folder
        System.out.println("Is file "+file.isFile());
        System.out.println("Is readable "+file.canRead());
        System.out.println("Is writable "+file.canWrite());
        System.out.println("Is executable "+file.canExecute());
        System.out.println("Is folder "+file.isDirectory());

    }
}
