package Liskov_substitution.bad;

public class Square extends Rectangle {
    public void setWidth(int _width) {
        this.width = _width;
        this.height = _width;
    }

    public void setHeight(int _hight) {
        this.height = _hight;
        this.width = _hight;
    }
}
