package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.app.Application;
import patterns.creational.abstractfactory.factories.GUIFactory;
import patterns.creational.abstractfactory.factories.MacOSFactory;
import patterns.creational.abstractfactory.factories.WindowsFactory;

public class AbstractFactoryApplication {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
