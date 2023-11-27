package patterns.creational.abstractfactory.checkboxes;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Создан WindowsCheckbox.");
    }
}
