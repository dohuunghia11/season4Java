package Season4_Dahinh_Kethua;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5,6,10,10);
        System.out.println(movablePoint.toString());

        MovablePoint movablePoint1 = new MovablePoint(7,9,10,10);
        System.out.println(movablePoint1.toString());

        System.out.println(movablePoint.move());
    }
}
