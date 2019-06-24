package Season4_Dahinh_Kethua;

import season1.CheckPrime;

public class TriangleTest {
    public static void main(String[] args) {
        System.out.println("Enter color :");
        String color = CheckPrime.scanner.nextLine();
        boolean repeatSidesInput = true;
        while (repeatSidesInput){
            System.out.println("Enter side1 :");
            double side1 = CheckPrime.scanner.nextDouble();
            System.out.println("Enter side2 :");
            double side2 = CheckPrime.scanner.nextDouble();
            System.out.println("Enter side3 :");
            double side3 = CheckPrime.scanner.nextDouble();
            try{
                Triangle triangle = new Triangle(side1, side2, side3 );
                repeatSidesInput = false;
                triangle.setColor(color);
                System.out.println(triangle.toString());
            } catch (IllegalTriangleException ex){
                System.err.println("Exception!!!");
            }
        }
    }
}
