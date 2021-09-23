package edu.najah.cap.oc;

public class TaxCalculator {
	
	public float CalculateTax(float amount,String country){
		float taxAmount = 0;
        switch(country)
        {
            case "USA":
                //calculate tax as per USA rules
                break;
            case "UK":
                //calculate tax as per UK rules
                break;
            case "IN":
                //calculate tax as per India rules
                break;
        }
        return taxAmount;
    }

}
