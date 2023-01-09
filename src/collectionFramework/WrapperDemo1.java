package collectionFramework;

public class WrapperDemo1 {
    public static void main(String[] args) {
        Integer integer1 = new Integer("20");
        Integer integer2 = new Integer("10");

        //primitive variable
        byte primitiveByte = Byte.parseByte("123");
        short parseShort = Short.parseShort("123");
        int primitiveInt = Integer.parseInt("123");
        long parseLong = Long.parseLong("123");
        float parseFloat = Float.parseFloat("10.5");
        double parseDouble = Double.parseDouble("123");
        boolean parseBoolean = Boolean.parseBoolean("true");

        //reference variable
        Byte byteWrapper = Byte.valueOf("123");
        Short shortWrapper = Short.valueOf("123");

        System.out.println(integer1+integer2);

        //autoboxing: converting primitive into wrapper object format
        //auto un-boxing : converting wrapper object into primitive format
        // all wrapper classes are immutable class
        // present inside java.lang
        // all wrapper classes implements Comparable(I)
        // parseXXX method convert string into primitive format
        //valueOf method converts string into wrapper format
    }
}
