package com.siet.org;

public class UPIPayments {
	private WalletPayment wallet;
	
	public UPIPayments(WalletPayment wallet) {
		super();
		this.wallet = wallet;
	}
	public void setWallet(WalletPayment wallet) {
		this.wallet = wallet;
	
	}
	public void pay()
	{
		wallet.payment();
		System.out.println("upipayment called walletpayment");
		
	}
	
	
	
	
	

}
