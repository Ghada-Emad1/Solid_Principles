package Liskov_substitution.bad;

public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int _width) {
        this.width = _width;
    }

    public void setHeight(int _hight) {
        this.height = _hight;
    }

    public int getArea() {
        return width * height;
    }
}

