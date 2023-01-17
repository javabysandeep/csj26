package collectionFramework.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(31);
        vector.add(50);
        vector.add(25);

        //ConcurrentModificationException
       /* for (Integer integer:vector) {
            if(integer%2==1){
                vector.remove(integer);
            }
            System.out.println(integer);
        }*/

        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
