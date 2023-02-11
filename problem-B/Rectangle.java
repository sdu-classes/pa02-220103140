public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;

    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        super.setColor(color);
        super.setFilled(filled);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return getLength()*getWidth();
    }

    public double getPerimeter(){
        return (getLength()+getWidth())*2;
    }
    @Override
    public String toString(){
        return "Rectangle[Shape[color = " + getColor() + ", filled = " + isFilled() + " ] width = " + getWidth() + " length  = " + getLength() + " ]";
    }
}
