package figures;

import java.math.BigDecimal;

public abstract class AbstractRegularPolygon implements RegularFigure
{

	protected BigDecimal sideLength;

	public AbstractRegularPolygon(BigDecimal sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public BigDecimal getArea() {
		return sideLength
				.multiply(sideLength)
				.multiply(BigDecimal.valueOf(
						0.25 * getSideQuantity() * (1.0 / Math.tan(Math.PI / getSideQuantity())))
				);
	}

	public BigDecimal getPerimeter() {
		return sideLength.multiply(BigDecimal.valueOf(getSideQuantity()));
	}

	@Override
	public BigDecimal getSideLength() {
		return sideLength;
	}

	public abstract int getSideQuantity();
}
