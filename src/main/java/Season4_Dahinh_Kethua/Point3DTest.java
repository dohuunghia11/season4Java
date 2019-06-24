package Season4_Dahinh_Kethua;

import season1.CheckPrime;

public class Point3DTest {
    public static void main(String[] args) {
        System.out.println("Enter x:");
        float x = CheckPrime.scanner.nextFloat();
        System.out.println("Enter y:");
        float y = CheckPrime.scanner.nextFloat();
        System.out.println("Enter z:");
        float z = CheckPrime.scanner.nextFloat();
        Point3D point3D = new Point3D(x,y,z);
        float[] arr = point3D.getXYZ();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        point3D.setXYZ(7,8,9);
        System.out.println(point3D.toString());
    }
}
