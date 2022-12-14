/*   ID   : 21CE027
     Name : Fachara Raj
     Aim  : Define a class named ComparableSquare that extends Square and implements 
            Comparable. Implement the compareTo method to compare the Squares on the basis 
            of area. Write a test class to find the larger of two instances of 
            ComparableSquareobjects.
 */
interface Comparable {
    public void compare(ComparableSquare s1, ComparableSquare s2);
}

class Squre {
    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

class ComparableSquare extends Squre implements Comparable {
    public void compare(ComparableSquare s1, ComparableSquare s2) {
        if (s1.getArea() == s2.getArea()) {
            System.out.println("Area of both square is same.");
        } else {
            System.out.println("Area of both square is diffrent.");
        }
    }
}

public class Prac10 {
    public static void main(String[] args) {
        ComparableSquare s1 = new ComparableSquare();
        ComparableSquare s2 = new ComparableSquare();
        s1.setSide(10);
        s2.setSide(8);
        System.out.println("Area of s1 : " + s1.getArea());
        System.out.println("Area of s2 : " + s2.getArea());
        s1.compare(s1, s2);
    }
}