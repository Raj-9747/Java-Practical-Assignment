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

public class Prac2_main {
    public static void main(String[] args) {
        Prac2_RegularPolygon p = new Prac2_RegularPolygon(4, 10, 2, 2);
        System.out.println("No. of sides : " + p.getN());
        System.out.println("Length of sides : " + p.getSide());
        System.out.println("X : " + p.getX());
        System.out.println("Y : " + p.getY());
        System.out.println("Area : " + p.getArea());
        System.out.println("Perimeter : " + p.getPerimeter());
    }
}

