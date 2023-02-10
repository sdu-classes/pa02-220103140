public class Shape {
    protected String color = "red";
    protected Boolean filled = true;

    public Shape(){

    }
    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return false;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[color = " + filled;
    }
}
class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color = " + super.color + ", " + super.filled + "]," + radius + "]";
    }
}

class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){

    }
    public Rectangle(double width, double length, String color,  boolean filled){
        this.width = width;
        this.length = length;
        this.filled = filled;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[color = " + color + ", " +  filled + " " + width + " " + length;
    }
}
class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super.length=side;
        super.width=side;
    }
    public Square(double side, String color, boolean filled){
        super.length=side;
        super.width=side;
        super.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double side) {
        super.length=side;
        super.width=side;
    }

    @Override
    public void setWidth(double width) {
        System.out.println("The Length and width shall be set to the same value");
    }

    @Override
    public void setLength(double length) {
        System.out.println("The Length and width shall be set to the same value");
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color = " + color + " " + filled + " " + width + " " + length;
    }
}
