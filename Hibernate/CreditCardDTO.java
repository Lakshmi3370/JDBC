package com.xworkz.credit_card.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card")
public class CreditCardDTO {

	@Id
	@Column(name = "card_id")
	private int cardId;
	@Column(name = "card_number")
	private long cardNumber;
	@Column(name = "expiry_date")
	private String expiryDate;
	@Column(name = "card_holder_name")
	private String cardHolderName;
	@Column(name = "nfc_enabled")
	private boolean nfcEnabled;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public boolean isNfcEnabled() {
		return nfcEnabled;
	}

	public void setNfcEnabled(boolean nfcEnabled) {
		this.nfcEnabled = nfcEnabled;
	}

}
