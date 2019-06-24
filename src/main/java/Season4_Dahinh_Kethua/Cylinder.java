package Season4_Dahinh_Kethua;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double height, double radius, String color, boolean filled){
        super(radius,color,filled);
        this.height = height;
    }

    public double setVolumeCylinder(){
        return Math.PI * Math.pow(this.getRadius(), 2) * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                + ", with height = " + getHeight()
                + " ,which is a subclass of "
                + super.toString();
    }
}
