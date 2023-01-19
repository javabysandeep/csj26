package collectionFramework.cursors;

import java.util.*;

public class ListIteratorDemo {
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

        ListIterator<Integer> listIterator = vector.listIterator();
        while (listIterator.hasNext()){
            Integer integer = listIterator.next();
            if(integer%2==1){
                //remove the element
                listIterator.remove();
            }
            System.out.println(integer);
            Collections.synchronizedList(new ArrayList<>());
        }

    }
}
