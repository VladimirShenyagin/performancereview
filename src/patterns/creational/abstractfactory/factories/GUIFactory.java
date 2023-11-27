package patterns.creational.abstractfactory.factories;

import patterns.creational.abstractfactory.buttons.Button;
import patterns.creational.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
