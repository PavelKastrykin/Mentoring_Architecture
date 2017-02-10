package figures;

import java.math.BigDecimal;

public class Circle implements RegularFigure {

	private static final String CIRCLE_NAME = "Circle";

	private BigDecimal radius;

	public Circle(BigDecimal radius) {
		this.radius = radius;
	}

	@Override
	public BigDecimal getArea() {
		return radius.multiply(radius).multiply(BigDecimal.valueOf(Math.PI));
	}

	@Override
	public BigDecimal getPerimeter() {
		return radius.multiply(BigDecimal.valueOf(Math.PI * 2.0));
	}

	@Override
	public BigDecimal getSideLength() {
		return radius;
	}

	@Override
	public String getName() {
		return CIRCLE_NAME;
	}
}
