public class Square extends Rectangle {
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
