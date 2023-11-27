package patterns.structural.decorator.decorators;

import patterns.structural.decorator.datasoruces.DataSource;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappedDataSource;

    public DataSourceDecorator(DataSource source) {
        this.wrappedDataSource = source;
    }

    @Override
    public void writeData(String data) {
        wrappedDataSource.writeData(data);
    }

    @Override
    public String readData() {
        return wrappedDataSource.readData();
    }
}