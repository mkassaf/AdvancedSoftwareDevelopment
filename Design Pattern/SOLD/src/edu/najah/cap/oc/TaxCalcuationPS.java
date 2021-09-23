package edu.najah.cap.oc;

public class TaxCalcuationPS implements TaxCalculatorIntf {

	@Override
	public float calculateTax(float amount) {
		// TODO Auto-generated method stub
		return (float) (amount * 0.15);
	}

}
