public class Shape{
    private String color = "red";
    private boolean filled = true;
    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    @Override
    public String toString(){
        return "Shape color= " + getColor() + "filled = " + isFilled();
    }
}
class Circle extends Shape{
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
 class Rectangle extends Shape{
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
class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public Square(double side, String color, boolean filled){
        super.setLength(side);
        super.setWidth(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    public double getSide() {
        return getLength();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    public String toString(){
        return "Square[Rectangle[Shape[color = " + getColor() + ", filled = " +isFilled()+" ], width = " + getWidth() + ", length = " +getLength()+ " ]]";
    }
}
