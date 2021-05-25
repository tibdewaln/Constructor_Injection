package com.springbeans;


public class MemberShip {
    private int membershipId;
    private String membershipType;
    private int visitsPerYear;
    private Customer customer;

    public MemberShip(int membershipId, String membershipType, int visitsPerYear, Customer customer) {
        this.membershipId = membershipId;
        this.membershipType = membershipType;
        this.visitsPerYear = visitsPerYear;
        this.customer = customer;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public int getVisitsPerYear() {
        return visitsPerYear;
    }

    public Customer getCustomer() {
        return customer;
    }
}	  	    	    	     	      	 	

