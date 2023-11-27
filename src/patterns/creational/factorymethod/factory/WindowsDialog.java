package patterns.creational.factorymethod.factory;

import patterns.creational.factorymethod.buttons.Button;
import patterns.creational.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}