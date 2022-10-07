package classComponents.nestedClasses;

public class LocalInnerClass {
    public static void main(String[] args) {
         int a = 100;
         //Local inner class can contain only non-static members
        class Local{
            int a = 10;
          /*static   int b = 10;
          static void m1(){}
            static class A{}
            static {}*/
            void m1(){
                System.out.println("instance method");
            }
        }
        Local local = new Local();
        System.out.println(local.a);
        local.m1();
    }
}
