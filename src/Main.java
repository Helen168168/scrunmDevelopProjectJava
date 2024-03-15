import org.primes.GeneratePrimes1;
import org.org.LSubstiPrinciple.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("计算素数");
        GeneratePrimes1 generatePrimes = new GeneratePrimes1();
        generatePrimes.GeneratePrimes(4);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(4));
        shapes.add(new Rectangle(3,5));
        new Client().calculateTotalArea(shapes);
    }
}