package input;

import java.math.BigDecimal;

public class DefaultInputValidator implements InputValidator {

	@Override
	public boolean validateCreate(String sideQuantity, String sideLength)
	{
		return validateQuantity(sideQuantity) && validateLength(sideLength);
	}

	protected boolean validateQuantity(String sideQuantity) {

		int quantity;

		try	{
			quantity = Integer.valueOf(sideQuantity);
		} catch (ClassCastException | NullPointerException e) {
			return false;
		}

		return quantity > 2 && quantity < 7;
	}

	protected boolean validateLength(String sideLength) {

		BigDecimal length;

		try {
			length = BigDecimal.valueOf(Double.valueOf(sideLength));
		} catch (ClassCastException | NullPointerException e) {
			return false;
		}

		return length.compareTo(BigDecimal.ZERO) > 0;
	}
}
