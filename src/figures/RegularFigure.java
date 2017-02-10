package figures;

import java.math.BigDecimal;

//Basic interface for all figures
public interface RegularFigure
{
	//Returns area of the figure
	BigDecimal getArea();

	//Returns perimeter of the figure
	BigDecimal getPerimeter();

	//Returns side length fot reguler polygons and radius for circles
	BigDecimal getSideLength();

	//Returns name of the figure
	String getName();
}
