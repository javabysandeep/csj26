package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo17Serialization {
    public static void main(String[] args) throws IOException {
        //save the object in file
        User user = new User(1,"abc","abc@gmail.com","abc","pass");
        File file = new File("user-object.txt");
        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);


        fileOutputStream.close();
        objectOutputStream.close();
        System.out.println("Object written successfully");
    }
}
