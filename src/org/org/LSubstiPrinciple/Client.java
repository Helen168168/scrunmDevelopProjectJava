package org.org.LSubstiPrinciple;

import java.util.ArrayList;
import java.util.List;
import org.org.LSubstiPrinciple.*;
public class Client {
    public void calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for(Shape shape: shapes) {
            totalArea += shape.getArea();
        }
        System.out.println("area is:  " + totalArea);
    }
}


