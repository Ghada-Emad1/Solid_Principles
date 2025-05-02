package Liskov_substitution.good;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area of Rectangle is " + rect.getArea());
        
        Square sqr = new Square(9);
        System.out.println("Area of Square is "+sqr.getArea());
    }
}
// now we separate behaviour of square and rectangle
// without forcing an inheritance where behaviour mismatches