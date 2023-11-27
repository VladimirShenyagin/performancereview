package patterns.structural.bridge.keys;

import patterns.structural.bridge.cars.Car;

public class AdvancedKey extends StandardKey{
    public AdvancedKey(Car car) {
        super.car = car;
    }

    public void remoteStart() {
        System.out.println("Удалённый запуск");
        car.disarm();
        car.start();
    }
}
