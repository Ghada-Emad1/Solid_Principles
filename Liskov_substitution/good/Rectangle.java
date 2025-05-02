package Liskov_substitution.good;

public class Rectangle implements ShapeInterface{
    private int width;
    private int height;

    public Rectangle(int _width, int _height) {
        this.height = _height;
        this.width = _width;
    }

    @Override
    public int getArea() {
        return width * height;
    }

}
