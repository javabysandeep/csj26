package accessSpecifiers.p1;

 public class A {
     //it is accessible only within the class
     private static int a = 100;

     //it is accessible throughout application
     public static int b = 200;

     //if we don't specify the access , then it is default: Accessible within the same pkg
     static int c = 300;

     //protected: it is accessible within the same pkg,
     // but if the sub-class is in diff pkg then it can be accessible
     protected static int d = 400;
}
