package com.springbeans;

public class Customer {
    private int custId;
    private String custName;
    private String emailId;
    private long contactNo;

    public Customer(int custId, String custName, String emailId, long contactNo) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.emailId = emailId;
		this.contactNo = contactNo;
	}
    
    public int getCustId() {
        return custId;
    }

    public String getCustName() {
        return custName;
    }

	public String getEmailId() {
        return emailId;
    }

    public long getContactNo() {
        return contactNo;
    }
    
    public String toString()
    {
        return this.custId + " " + this.custName + " " + this.emailId + " " + this.contactNo;
    }
}


