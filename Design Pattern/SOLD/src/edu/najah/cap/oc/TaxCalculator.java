package edu.najah.cap.oc;

public class TaxCalculator {
	//Close for modification open for extension
	public float calculateTax(float amount,String country){
		float taxAmount = 0;
        switch(country) {
            case "USA":
            	taxAmount = (float) (amount * 0.1);
                break;
            case "UK":
            	taxAmount = (float) (amount * 0.4);
                break;
            case "IN":
            	taxAmount = (float) (amount * 0.2);
                break;
          
        }
        return taxAmount;
    }

}
