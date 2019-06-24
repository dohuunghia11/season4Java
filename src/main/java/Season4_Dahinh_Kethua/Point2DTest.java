package Season4_Dahinh_Kethua;

import season1.CheckPrime;

public class Point2DTest {
    public static void main(String[] args) {
        System.out.println("Enter x:");
        float x = CheckPrime.scanner.nextFloat();
        System.out.println("Enter y:");
        float y = CheckPrime.scanner.nextFloat();
        Point2D point2D = new Point2D(x,y);
        float[] arr = point2D.getXY();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        point2D.setXY(6,7);
        System.out.println(point2D.toString());
    }
}
