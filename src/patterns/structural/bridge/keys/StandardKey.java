package patterns.structural.bridge.keys;

import patterns.structural.bridge.cars.Car;

public class StandardKey implements Key{
    protected Car car;
    public StandardKey() {}

    public StandardKey(Car car) {
        this.car = car;
    }
    @Override
    public void turn() {
        System.out.println("Поворот ключа");
        if (car.isEngaged()) {
            car.stop();
        } else {
            car.start();
        }
    }

    @Override
    public void alarm() {
        System.out.println("Переключить сигнализацию");
        if (car.isArmed()) {
            car.disarm();
        } else {
            car.arm();
        }
    }
}
