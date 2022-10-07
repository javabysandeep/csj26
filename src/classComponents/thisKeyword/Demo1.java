package classComponents.thisKeyword;

public class Demo1 {
    int a=100;
    public static void main(String[] args) {
        Student student = new Student(1, "abc");
        System.out.println(student.id + "\t" + student.name);
        student.m1();

        Demo1 demo1 = new Demo1();
//        System.out.println(this.a);
    }
    void m1(){
        System.out.println(this.a);
    }
}
