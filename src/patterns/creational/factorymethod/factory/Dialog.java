package patterns.creational.factorymethod.factory;

import patterns.creational.factorymethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
