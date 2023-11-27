package patterns.structural.adapter;

import patterns.structural.adapter.adapters.SquareFigureToCircleHoleAdapter;
import patterns.structural.adapter.circle.CircleFigure;
import patterns.structural.adapter.circle.CircleHole;
import patterns.structural.adapter.square.SquareFigure;

public class AdapterApplication {
    public static void main(String[] args) {
        CircleHole circleHole = new CircleHole(10);
        CircleFigure circleFigure = new CircleFigure(10);

        if (circleHole.fits(circleFigure)) {
            System.out.println("Круглая фигура радиусом " + circleHole.getRadius() + " проходит в круглое отверстие радиусом " + circleFigure.getRadius());
        }

        SquareFigure smallSquareFigure = new SquareFigure(3);
        SquareFigure largeSquareFigure = new SquareFigure(30);

        SquareFigureToCircleHoleAdapter smallSquareCircleAdapter = new SquareFigureToCircleHoleAdapter(smallSquareFigure);
        SquareFigureToCircleHoleAdapter largeSquareCircleAdapter = new SquareFigureToCircleHoleAdapter(largeSquareFigure);

        if (circleHole.fits(smallSquareCircleAdapter)) {
            System.out.println("квадратная фигура шириной " + smallSquareFigure.getWidth() + " проходит в круглое отверстие радиусом " + circleHole.getRadius());
        }

        if (!circleHole.fits(largeSquareCircleAdapter)) {
            System.out.println("Квадратная фигура шириной " + largeSquareFigure.getWidth() + " не проходит в круглое отверстие радиусом " + circleHole.getRadius());
        }
    }
}
