package patterns.creational.abstractfactory.checkboxes;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Создан MacOSCheckbox.");
    }
}
