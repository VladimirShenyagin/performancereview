package patterns.creational.factorymethod.buttons;

public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Тестовая кнопка</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("'Hello World!'");
    }

}
