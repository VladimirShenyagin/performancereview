package patterns.structural.decorator.datasoruces;

public interface DataSource {

    void writeData(String data);

    String readData();
}
