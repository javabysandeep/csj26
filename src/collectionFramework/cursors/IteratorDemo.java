package collectionFramework.cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {
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

        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            if(integer%2==1){
                //remove the element
                iterator.remove();
            }
            System.out.println(integer);
        }

    }
}
