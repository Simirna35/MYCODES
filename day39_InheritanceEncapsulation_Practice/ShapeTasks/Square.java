package day39_InheritanceEncapsulation_Practice.ShapeTasks;

public class  Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Invalid Side : " + side);
            System.exit(1);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4 ;

    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + side +
                "area = '" + " " + area() + '\'' +
                "perimeter='"+ " " + perimeter() + '\'' +
                '}';
    }
}



 /*
 variables:
        side;

        Encapsulate the field

        Add a constructor to set the filed

        area(): side * side
        perimeter(): side * 4
        toString(): side, area, perimeter
  */