package figures;

import java.math.BigDecimal;

public class Triangle extends AbstractRegularPolygon {

	private static final int SIDE_QUANTITY = 3;
	private static final String POLYGON_NAME = "Triangle";

	public Triangle(BigDecimal sideLength) {
		super(sideLength);
	}

	@Override
	public int getSideQuantity() {
		return SIDE_QUANTITY;
	}

	@Override
	public BigDecimal getArea() {
		return sideLength
				.multiply(sideLength)
				.multiply(BigDecimal.valueOf(Math.sqrt(3)).divide(BigDecimal.valueOf(4), 4));
	}

	@Override
	public String getName() {
		return POLYGON_NAME;
	}
}
