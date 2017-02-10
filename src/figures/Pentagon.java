package figures;

import java.math.BigDecimal;

public class Pentagon extends AbstractRegularPolygon {

	private static final int SIDE_QUANTITY = 5;
	private static final String POLYGON_NAME = "Pentagon";

	public Pentagon(BigDecimal sideLength) {
		super(sideLength);
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
