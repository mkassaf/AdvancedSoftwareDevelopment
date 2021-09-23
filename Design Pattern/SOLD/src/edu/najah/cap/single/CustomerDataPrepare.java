package edu.najah.cap.single;

import java.util.List;

public class CustomerDataPrepare {
	
	public static String perpare(List<Customer> customers) {
    	StringBuilder sb = new StringBuilder();
    	for(Customer item : customers) {
            sb.append(item.CustomerID);
            sb.append(",");
            sb.append(item.CompanyName);
            sb.append(",");
            sb.append(item.ContactName);
            sb.append(",");
            sb.append(item.Country);
        }
    	return sb.toString();
    }

}
