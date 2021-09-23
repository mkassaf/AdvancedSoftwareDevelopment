package edu.najah.cap.single;

import java.util.List;

public class CustomerHelper {
	
	NorthwindEntities db = new NorthwindEntities();

    public List<Customer> GetAllCustomers(){
        return db.getCustomers();
    }

    public Customer GetCustomerByID(String customerid)
    {
        return db.Customers.find(customerid);
    }

    public String ExportCustomerData()
    {
        List<Customer> data = GetAllCustomers();
        StringBuilder sb = new StringBuilder();
        for(Customer item : data) {
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
