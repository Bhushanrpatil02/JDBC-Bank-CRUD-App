package com.yash.bankmanagment.Service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.yash.Bank_Model.Account;
import com.yash.bank.Exception.InSuffitiantBalanceException;

public interface Rbi {

	public Account createAccount();

	public void viewAccountDetails();

	public void depositeMoney();

	public void withDrawal();

	public void viewBalance();

	public void updateAccountDetails();

}
