package org.org.LSubstiPrinciple;
import org.org.LSubstiPrinciple.*;

public class Square extends Shape{
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
