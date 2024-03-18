import org.primse.GeneratePrimes1;
import org.openClosePrinciple.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("重构。。。");
        GeneratePrimes1 generatePrimes = new GeneratePrimes1();
        generatePrimes.GeneratePrimes(4);
         System.out.println("OCP原则-开发关闭。。。");
         new AnimalSoundSystem2(new DogSound());
        new AnimalSoundSystem2(new CatSound());
        new AnimalSoundSystem2(new ParrotSound());
    }
}