package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP");
	}
	public boolean addPayment() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING A PAYMENT TO MEMBERSHIP");
		return true;
	}

}
