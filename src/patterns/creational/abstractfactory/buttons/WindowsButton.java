package patterns.creational.abstractfactory.buttons;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Создана WindowsButton.");
    }
}
