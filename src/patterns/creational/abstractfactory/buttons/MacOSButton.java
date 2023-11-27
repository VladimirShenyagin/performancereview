package patterns.creational.abstractfactory.buttons;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Создана MacOSButton.");
    }
}
