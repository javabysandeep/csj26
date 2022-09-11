public class IncrementDecrementOperators {
    public static void main(String[] args) {
//        System.out.println((5+3)++);//CTE
        int a = 1;
        int b = ++a;//b=2, a=2
        int c = b++;//c=2, b=3
        int d = a++ ;// d=2, a=3
        System.out.println(a);//3
        System.out.println(b);//3
        System.out.println(c);//2
        System.out.println(d);//2

        int p = 10;
        int q = 20;
        int r = --p;//p=9, r=9
        int s = q--;//s=20, q=19
        System.out.println(p);//9
        System.out.println(q);//19
        System.out.println(r);//9
        System.out.println(s);//20

        int e = 1;
        int f = 2;
        int g = 3;
        int h = 4;

        System.out.println( e++ + --f + ++g + --e + h++ + --g);//14
        System.out.println(e);//1
        System.out.println(f);//1
        System.out.println(g);//3
        System.out.println(h);//5




    }
}
