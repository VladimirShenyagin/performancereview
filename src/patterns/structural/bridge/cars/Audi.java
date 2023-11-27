package patterns.structural.bridge.cars;

public class Audi implements Car {
    private boolean engaged = false;
    private boolean armed = true;

    @Override
    public boolean isArmed() {
        return armed;
    }

    @Override
    public boolean isEngaged() {
        return engaged;
    }

    @Override
    public void arm() {
        armed = true;
    }

    @Override
    public void disarm() {
        armed = false;
    }

    @Override
    public void start() {
        engaged = true;
    }

    @Override
    public void stop() {
        engaged = false;
    }

    @Override
    public void printStatus() {
        System.out.println("------------");
        System.out.println("Я - Ауди");
        System.out.println("Я " + (armed ? "на сигнализации": "не на сигнализации"));
        System.out.println("Двигатель " + (engaged ? "запущен" : "остановлен"));
    }
}
