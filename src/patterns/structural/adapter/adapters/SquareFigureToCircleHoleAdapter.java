package patterns.structural.adapter.adapters;

import patterns.structural.adapter.circle.CircleFigure;
import patterns.structural.adapter.square.SquareFigure;

public class SquareFigureToCircleHoleAdapter extends CircleFigure {
    private SquareFigure squareFigure;

    public SquareFigureToCircleHoleAdapter(SquareFigure squareFigure) {
        this.squareFigure = squareFigure;
    }


    @Override
    public double getRadius() {
        return (squareFigure.getWidth() * Math.sqrt(2)) / 2;
    }
}
