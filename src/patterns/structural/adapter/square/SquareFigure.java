package patterns.structural.adapter.square;

public class SquareFigure {
    private double width;

    public SquareFigure(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
