package patterns.creational.builder.components;

import patterns.creational.builder.cars.Car;

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Уровень топлива: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Двигатель запущен");
        } else {
            System.out.println("Двигатель остановлен");
        }
    }
}
