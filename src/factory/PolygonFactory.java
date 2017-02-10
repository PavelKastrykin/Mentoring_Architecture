package factory;

import figures.RegularPolygon;

import java.math.BigDecimal;

public interface PolygonFactory {

	RegularPolygon getRegularPolygon(int sideQuantity, BigDecimal sideLength);
}
