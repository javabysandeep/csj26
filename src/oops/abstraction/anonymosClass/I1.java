package oops.abstraction.anonymosClass;

public interface I1 {
    void m1();

    public static void main(String[] args) {
        I1 i1 = new I1(){
            @Override
            public void m1() {
                System.out.println("m1 implemented");
            }
        };
        i1.m1();

        //functional interface implementation
        I1 lam = ()-> System.out.println("m1 implemented in lambda");
        lam.m1();
    }
}
