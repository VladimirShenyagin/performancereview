package patterns.structural.bridge;

import patterns.structural.bridge.cars.Audi;
import patterns.structural.bridge.cars.Car;
import patterns.structural.bridge.cars.Lada;
import patterns.structural.bridge.keys.AdvancedKey;
import patterns.structural.bridge.keys.StandardKey;

public class BridgeApplication {
    public static void main(String[] args) {
        testCar(new Audi());
        testCar(new Lada());

    }

    public static void testCar(Car car) {
        System.out.println();
        System.out.println("Тест стандартного ключа");
        StandardKey standardKey = new StandardKey(car);
        standardKey.alarm();
        standardKey.turn();
        car.printStatus();

        System.out.println();

        System.out.println("Тест продвинутого ключа");
        AdvancedKey advancedKey = new AdvancedKey(car);
        advancedKey.remoteStart();
        car.printStatus();
    }
}
