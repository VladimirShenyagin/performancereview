package patterns.creational.singleton;

public class SingletonApplication {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Если значение одно и то же, то синглтон был переиспользован" + "\n" +
                "Если значения разные, то было создано два синглтона" + "\n\n" +
                "Результат:" + "\n");
        System.out.println("-----потокобезопасный вариант-----");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
        threadFoo.join();
        threadBar.join();

        System.out.println("-----А теперь не потоконебезопасный вариант-----");
        threadFoo = new Thread(new ThreadUnsafeFoo());
        threadBar = new Thread(new ThreadUnsafeBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

    static class ThreadUnsafeFoo implements Runnable {
        @Override
        public void run() {
            ThreadUnsafeSingleton singleton = ThreadUnsafeSingleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadUnsafeBar implements Runnable {
        @Override
        public void run() {
            ThreadUnsafeSingleton singleton = ThreadUnsafeSingleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
