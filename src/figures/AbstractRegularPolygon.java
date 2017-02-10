package figures;

import java.math.BigDecimal;

public abstract class AbstractRegularPolygon implements RegularPolygon {

	protected BigDecimal sideLength;

	public AbstractRegularPolygon(BigDecimal sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public BigDecimal getSideLength() {
		return sideLength;
	}

}
