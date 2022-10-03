package classComponents.constructor;

public class Color {
    byte b1;
    short s1;
    int i1;
    long l1;
    float f1;
    double d1;
    char c1;
    boolean bool1;

    public Color() {
    }

    public Color(byte b1, short s1, int i1, long l1, float f1, double d1, char c1, boolean bool1) {
        this.b1 = b1;
        this.s1 = s1;
        this.i1 = i1;
        this.l1 = l1;
        this.f1 = f1;
        this.d1 = d1;
        this.c1 = c1;
        this.bool1 = bool1;
    }

    public static void main(String[] args) {
        Color color = new Color();
    }

}
