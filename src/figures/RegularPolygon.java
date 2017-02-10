package figures;

import java.math.BigDecimal;

//Basic interface for all polygon figures
public interface RegularPolygon
{
	//Returns area of regular polygon
	default BigDecimal getArea(BigDecimal sideLength) {
		return sideLength
				.multiply(sideLength)
				.multiply(BigDecimal.valueOf(
						0.25 * getSideQuantity() * (1.0 / Math.tan(Math.PI / getSideQuantity())))
				);
	}

	//Returns quantity of sides for the regular polygon
	int getSideQuantity();

	//Returns perimeter of regular polygon
	default BigDecimal getPerimeter(BigDecimal sideLength) {
		return sideLength.multiply(BigDecimal.valueOf(getSideQuantity()));
	}

	BigDecimal getSideLength();

	String getName();
}
