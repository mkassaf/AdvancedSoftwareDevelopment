package edu.najah.cap.oc;

public class TaxDemo {
	
	
	TaxCalculatorIntf calculatorIntf =  new TaxCalcuationPS();
	public float getTax(TaxCalculatorIntf calculatorIntf) {
		return 	calculatorIntf.calculateTax(44);
	}

}
