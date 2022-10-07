package classComponents.nestedRevision;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Constants.Oracle.username);//static variable from oracle
        Constants.Oracle.m2();//static method from oracle

        System.out.println(Constants.number);//static variable from Constants class

        //non-static members from static nested class
        Constants.Oracle oracle = new Constants.Oracle();
        System.out.println(oracle.password);
        oracle.m1();
    }
}
