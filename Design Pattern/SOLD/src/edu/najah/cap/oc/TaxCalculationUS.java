package edu.najah.cap.oc;

public class TaxCalculationUS implements TaxCalculatorIntf {

	@Override
	public float calculateTax(float amount) {
		return (float) (amount * 0.2);
	}

}
