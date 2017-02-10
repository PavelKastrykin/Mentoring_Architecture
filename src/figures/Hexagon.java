package figures;

import java.math.BigDecimal;

public class Hexagon extends AbstractRegularPolygon {

	private static final int SIDE_QUANTITY = 6;
	private static final String POLYGON_NAME = "Hexagon";

	public Hexagon(BigDecimal sideLength) {
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
				.multiply(BigDecimal.valueOf(Math.sqrt(3)).multiply(BigDecimal.valueOf(1.5)));
	}

	@Override
	public String getName() {
		return POLYGON_NAME;
	}
}
