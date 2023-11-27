package patterns.creational.factorymethod;

import patterns.creational.factorymethod.factory.Dialog;
import patterns.creational.factorymethod.factory.HtmlDialog;
import patterns.creational.factorymethod.factory.WindowsDialog;

public class FactoryMethodApplication {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
