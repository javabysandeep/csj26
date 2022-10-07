package classComponents.nestedClasses;

public class DatabaseTest {
    public static void main(String[] args) {
        //local DB credentials
        System.out.println("local DB Username "+Database.LocalDatabase.USERNAME);
        System.out.println("local DB Password  "+Database.LocalDatabase.PASSWORD);

        //Deb DB credentials
        System.out.println("Dev DB username "+Database.DevDatabase.USERNAME);
        System.out.println("Dev DB password "+Database.DevDatabase.PASSWORD);

        //prod DB credentials
        System.out.println("Prod DB Username "+Database.ProdDatabase.USERNAME);
        System.out.println("Prod DB password "+Database.ProdDatabase.PASSWORD);
    }
}
