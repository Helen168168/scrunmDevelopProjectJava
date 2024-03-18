import org.dependencyIPrinciple.Button;
import org.dependencyIPrinciple.Lamp;
import org.dependencyIPrinciple.SwitchableDevice;
import org.org.LSubstiPrinciple.Client;
import org.org.LSubstiPrinciple.Rectangle;
import org.org.LSubstiPrinciple.Shape;
import org.org.LSubstiPrinciple.Square;
import org.primse.GeneratePrimes1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("计算素数");
        GeneratePrimes1 generatePrimes = new GeneratePrimes1();
        generatePrimes.GeneratePrimes(4);

        System.out.println("实现OCP");
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(4));
        shapes.add(new Rectangle(3,5));
        new Client().calculateTotalArea(shapes); // Area is: 31

        System.out.println("实现DIP程序");
        SwitchableDevice lamp = new Lamp();
        Button button = new Button(lamp);
        button.press();  // 输出 "Lamp is turned on."
    }
}