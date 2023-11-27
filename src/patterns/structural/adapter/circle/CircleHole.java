package patterns.structural.adapter.circle;

public class CircleHole {
    private double radius;

    public CircleHole(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public boolean fits(CircleFigure figure) {
        return this.getRadius() >= figure.getRadius();
    }

}
