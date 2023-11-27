package patterns.creational.abstractfactory.factories;

import patterns.creational.abstractfactory.buttons.Button;
import patterns.creational.abstractfactory.buttons.MacOSButton;
import patterns.creational.abstractfactory.checkboxes.Checkbox;
import patterns.creational.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
