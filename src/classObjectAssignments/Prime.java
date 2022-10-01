package classObjectAssignments;



public class Prime {
    public static void main(String[] args) {
        System.out.println(Prime.isPrime(29));
    }
    private static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <number/2 ; i++) {
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        return  isPrime;
    }
}
