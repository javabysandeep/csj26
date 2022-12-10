package fileHandling;

import java.io.*;

public class Demo18DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //read the object in file
        File file = new File("user-object.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        User user = (User) objectInputStream.readObject();
        System.out.println(objectInputStream.readObject());
//        System.out.println(user);


        fileInputStream.close();
        objectInputStream.close();
        System.out.println("object read successfully");
    }
}
