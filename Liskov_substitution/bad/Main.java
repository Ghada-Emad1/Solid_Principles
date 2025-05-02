package Liskov_substitution.bad;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setHeight(10);
        rect.setWidth(10);
        System.out.println("Area of Rectangle is " + rect.getArea());
        
        Square sqr = new Square();
        sqr.setHeight(3);
        System.out.println("Area of Square is "+sqr.getArea());
    }
}

// the problem is that square don't behave like the rectangle
// when setting width and height , which voilate liskov substitution principle