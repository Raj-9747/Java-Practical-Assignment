/*  ID   : 21CE027
    Name : Fachara Raj
    Aim  : In an n-sided regular polygon, all sides have the same length and all angles have the 
            named RegularPolygon that contains: 
            same degree (i.e., the polygon is both equilateral and equiangular). Design a class 
             A private int data field named n that defines the number of sides in the 
            polygon with default value 3.
             A private double data field named side that stores the length of the side with 
            default value 1.
             A private double data field named x that defines the x-coordinate of the 
            polygon’s center with default value 0.
             A private double data field named y that defines the y-coordinate of the 
            polygon’s center with default value 0.
             A no-arg constructor that creates a regular polygon with default values. 
             A constructor that creates a regular polygon with the specified number of sides 
            and length of side, centered at (0, 0).
             A constructor that creates a regular polygon with the specified number of 
            sides, length of side, and x- and y-coordinates.
             The accessor and mutator methods for all data fields.
             The method getPerimeter() that returns the perimeter of the polygon. 
             The method getArea() that returns the area of the polygon. The formula for 
            computing the area of a regular polygon is:
 */

public class Prac2_RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public Prac2_RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public Prac2_RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    public Prac2_RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
