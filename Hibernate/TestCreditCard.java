package com.xworkz.credit_card.tester;

import com.xworkz.credit_card.dao.CreditCardDAO;
import com.xworkz.credit_card.dao.CreditCardDAOImpli;
import com.xworkz.credit_card.dto.CreditCardDTO;

public class TestCreditCard {

	public static void main(String[] args) {
		
		CreditCardDTO creditcardto = new CreditCardDTO();
		creditcardto.setCardId(1);
		creditcardto.setCardNumber(988823l);
		creditcardto.setExpiryDate("19/03/2022");
		creditcardto.setCardHolderName("John");
		creditcardto.setNfcEnabled(false);
		
		
		CreditCardDTO creditcardto1 = new CreditCardDTO();
		creditcardto1.setCardId(2);
		creditcardto1.setCardNumber(3523229l);
		creditcardto1.setExpiryDate("1/03/2022");
		creditcardto1.setCardHolderName("Lakshmi");
		creditcardto1.setNfcEnabled(true);
		
		CreditCardDTO creditcardto2 = new CreditCardDTO();
		creditcardto2.setCardId(3);
		creditcardto1.setCardNumber(7884229l);
		creditcardto2.setExpiryDate("21/03/2022");
		creditcardto2.setCardHolderName("Rashmi");
		creditcardto2.setNfcEnabled(true);
		
		
		CreditCardDAO dao = new CreditCardDAOImpli();
		
		dao.saveCard(creditcardto);
		dao.saveCard(creditcardto1);
		dao.saveCard(creditcardto2);
		
		
		}

}
