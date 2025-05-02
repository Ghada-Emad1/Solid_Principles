package Liskov_substitution.good;

public class Square implements ShapeInterface{
    private int side;

    public Square(int _side) {
        this.side = _side;
    }
    @Override
    public int getArea(){
        return side*side;
    }
}
