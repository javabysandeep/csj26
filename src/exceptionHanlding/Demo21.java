package exceptionHanlding;

public class Demo21 {
    public static void main(String[] args) {
        Demo20  demo20 = new Demo20();
        Demo21 demo21 = new Demo21();
        demo21.equals(demo20);
//        ClassCastException is a RunTimeException which occurs when
//        JVM unable to cast an object of one type to another type.
    }

    @Override
    public boolean equals(Object obj) {
        Demo21 demo = (Demo21) obj;
        return this.equals(demo);
    }
}
