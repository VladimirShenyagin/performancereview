package patterns.creational.builder.cars;

import patterns.creational.builder.components.Engine;
import patterns.creational.builder.components.GPSNavigator;
import patterns.creational.builder.components.Transmission;
import patterns.creational.builder.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType,
                  int seats,
                  Engine engine,
                  Transmission transmission,
                  TripComputer tripComputer,
                  GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Тип автомобиля: " + carType + "\n";
        info += "Число сидений: " + seats + "\n";
        info += "Двигатель: Объём - " + engine.getVolume() + "; пробег - " + engine.getMileage() + "\n";
        info += "Коробка передач: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Бортовой компьютер: работает" + "\n";
        } else {
            info += "Бортовой компьютер: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "Навигатор: работает" + "\n";
        } else {
            info += "Навигатор: N/A" + "\n";
        }
        return info;
    }
}
