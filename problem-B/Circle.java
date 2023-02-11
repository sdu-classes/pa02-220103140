public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }
    @Override
    public String toString(){
        return "Circle[Shape[color = " + getColor() + " filled = " + isFilled() +" ] radius = " + getRadius();
    }

}
