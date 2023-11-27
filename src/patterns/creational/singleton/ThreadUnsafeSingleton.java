package patterns.creational.singleton;

public final class ThreadUnsafeSingleton {
    private static ThreadUnsafeSingleton instance;
    public String value;

    private ThreadUnsafeSingleton(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static ThreadUnsafeSingleton getInstance(String value) {
        if (instance == null) {
            instance = new ThreadUnsafeSingleton(value);
        }
        return instance;
    }
}
