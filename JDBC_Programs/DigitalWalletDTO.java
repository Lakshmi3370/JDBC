package com.xwork.digital_wallet.dto;

public class DigitalWalletDTO {

	private int wallet_Id;
	private String providerName;
	private double availableBalance;
	private int noOfTransction;


	public int getWallet_Id() {
		return wallet_Id;
	}
	public void setWallet_Id(int wallet_Id) {
		this.wallet_Id = wallet_Id;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public int getNoOfTransction() {
		return noOfTransction;
	}
	public void setNoOfTransction(int noOfTransction) {
		this.noOfTransction = noOfTransction;
	}



	}

