package figures;

import java.math.BigDecimal;

public class Square extends AbstractRegularPolygon {

	private static final int SIDE_QUANTITY = 4;
	private static final String POLYGON_NAME = "Square";

	public Square(BigDecimal sideLength) {
		super(sideLength);
	}

	@Override
	public BigDecimal getArea(BigDecimal sideLength) {
		return sideLength.multiply(sideLength);
	}

	@Override
	public int getSideQuantity() {
		return SIDE_QUANTITY;
	}

	@Override
	public String getName() {
		return POLYGON_NAME;
	}
}
