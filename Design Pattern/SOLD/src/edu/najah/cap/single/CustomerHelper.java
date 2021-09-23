package edu.najah.cap.single;

import java.util.List;

public class CustomerHelper {
	
	NorthwindEntities db = new NorthwindEntities();

    public List<Customer> GetAllCustomers(){
    	//string sql = "select * from customers";
    	//
        return db.getCustomers();
    }

    public Customer GetCustomerByID(String customerid) {
        return db.Customers.find(customerid);
    }

    public String ExportCustomerData() {
        List<Customer> data = GetAllCustomers();
        return CustomerDataPrepare.perpare(data);
    }
    
    

}
