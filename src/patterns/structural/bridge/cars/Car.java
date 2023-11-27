package patterns.structural.bridge.cars;

public interface Car {
    boolean isArmed();

    boolean isEngaged();
    void arm();

    void disarm();

    void start();
    void stop();

    void printStatus();
}
