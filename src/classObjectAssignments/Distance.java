package classObjectAssignments;

public class Distance {
    float addDistances(float distance1, float distance2){
        return distance1 +distance2;
    }

    public static void main(String[] args) {
        Distance distance = new Distance();
        System.out.println(distance.addDistances(2.5f,3.5f));
    }
}
