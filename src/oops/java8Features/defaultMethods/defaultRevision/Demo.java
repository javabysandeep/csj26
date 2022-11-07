package oops.java8Features.defaultMethods.defaultRevision;

public class Demo {
    public static void main(String[] args) {

    }
}
interface  StringProducer {
//    void produce();
    default void produce(){
        System.out.println("strings are produced");
    }
}
interface  StringProducer1 {
//    void produce();
    default void produce(){
        System.out.println("strings are produced");
    }
}
class StringProducerImpl implements StringProducer, StringProducer1 {
    @Override
    public void produce() {
        StringProducer.super.produce();
        StringProducer1.super.produce();
    }
}

