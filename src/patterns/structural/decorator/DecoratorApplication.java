package patterns.structural.decorator;

import patterns.structural.decorator.datasoruces.DataSource;
import patterns.structural.decorator.datasoruces.FileDataSource;
import patterns.structural.decorator.decorators.CompressionDecorator;
import patterns.structural.decorator.decorators.DataSourceDecorator;
import patterns.structural.decorator.decorators.EncryptionDecorator;

public class DecoratorApplication {

    public static final String FILE_PATH = "out/production/performancereview/patterns/structural/decorator/OutputDemo.txt";

    public static void main(String[] args) {

        String testStr = "Тестовая строка для тестирования;\nТестовая строка для тестирования;\nТестовая строка для тестирования;";
        DataSourceDecorator encoded =
                new CompressionDecorator(
                        new EncryptionDecorator(
                                new FileDataSource(FILE_PATH)));
        encoded.writeData(testStr);
        DataSource plain = new FileDataSource(FILE_PATH);

        System.out.println("- Входящая строка ----------------");
        System.out.println(testStr);
        System.out.println("- Закодированная строка --------------");
        System.out.println(plain.readData());
        System.out.println("- Декодированная строка --------------");
        System.out.println(encoded.readData());
    }
}
