package classComponents;

public class Block {
    //instance block
    {
        System.out.println("instance block");
    }

    //static block
    static {
        System.out.println("static block");
    }

    public Block() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        Block block = new Block();
    }

}
