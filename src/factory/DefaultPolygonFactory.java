package factory;

import figures.Circle;
import figures.Hexagon;
import figures.Pentagon;
import figures.RegularFigure;
import figures.Square;
import figures.Triangle;

import java.math.BigDecimal;

public class DefaultPolygonFactory implements PolygonFactory {

	@Override
	public RegularFigure getRegularPolygon(int sideQuantity, BigDecimal sideLength)
	{
		switch (sideQuantity) {
			case 0:
				return new Circle(sideLength);
			case 3:
				return new Triangle(sideLength);
			case 4:
				return new Square(sideLength);
			case 5:
				return new Pentagon(sideLength);
			case 6:
				return new Hexagon(sideLength);
			default:
				return null;
		}
	}
}
