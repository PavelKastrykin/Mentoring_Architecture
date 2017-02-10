package factory;

import figures.RegularFigure;

import java.math.BigDecimal;

public interface PolygonFactory {

	RegularFigure getRegularPolygon(int sideQuantity, BigDecimal sideLength);
}
