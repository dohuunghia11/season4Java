package Season4_Dahinh_Kethua;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,3,"red", true);
        System.out.println(cylinder.toString());
        System.out.println("Volume cylinder is : " + cylinder.setVolumeCylinder());
    }
}
