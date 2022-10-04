package classComponents;

import java.time.LocalDateTime;

public class Episode {
    static  int objectCounter = 0;
    {
        System.out.println("instance block1");
        System.out.println("episode created at "+ LocalDateTime.now());
        objectCounter++;
    }
    static {
        System.out.println("static block");
    }



    public static void main(String[] args) {
        Episode episode1 = new Episode();
        Episode episode2 = new Episode();
        Episode episode3 = new Episode();
        Episode episode4 = new Episode();
        Episode episode5 = new Episode();
        System.out.println("number of objects created "+Episode.objectCounter);
    }
}
