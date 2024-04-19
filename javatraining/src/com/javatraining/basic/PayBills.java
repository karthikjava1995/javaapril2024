package com.javatraining.basic;

public class PayBills {// parent
	int amount = 300;
	void payment() {
		System.out.println("send money home,recharge mobile,shop online");
	}
}

class Googlepay extends PayBills {
	int amount = 100;

	void payment()
	{
		super.payment();
		System.out.println("Do direct bank to bank transfer");
		System.out.println("parent Amount:" + super.amount);
	}

//public class TransferMoney
	public static void main(String[] args) {
		Googlepay obj1 = new Googlepay();
		obj1.payment();
	}
}
