package ganesh_codes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
     
	private int customerNumber;
    private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	Scanner input=new Scanner(System.in);
     DecimalFormat MoneyFormat=new DecimalFormat("$ #,##0.00");
     
     /*get account Number of a customer */
     
	public void setCustomerNumber(int customerNumber)
	{
		this.customerNumber=customerNumber;
	}
	
	/*get the pin number */
	
	public void setPinNumber(int pinNumber)
	{
		this.pinNumber=pinNumber;
	}
	
	public int getAccountNumber()
	{
		return customerNumber;
	}
	
	public int getPinNumber()
	{
		return pinNumber;
	}
	
	/* balance of checking account*/
	
	public double getCheckingBalance()
	{
		return checkingBalance;
	}
	
	/*balance of saving account */
	
	public double getSavingBalance()
	{
		return savingBalance;
	}
	
	/*Withdraw the amount from checking account */
	
	public void calcCheckingWithdraw(double amount)
	{
		checkingBalance-=amount;
	}
	
	/*Withdraw the amount from savings account */
	
	public void calcSavingWithdraw(double amount)
	{
		savingBalance-=amount;
	}
	
	/*deposit the amount into checking account */
	
	public void calcCheckingDeposit(double amount)
	{
		checkingBalance+=amount;
	}
	
	/*deposit the amount into savings account */
	
	public void calcSavingDeposit(double amount)
	{
		savingBalance+=amount;
	}
	
	/*take the amount to withdraw from checking account */ 
	
	public void getCheckingWithdrawInput() {
		System.out.println("checking balance :"+MoneyFormat.format(checkingBalance));
	    System.out.println("Amount you want to withdraw from checking account");
		double amount=input.nextDouble();
		if(checkingBalance-amount>=0)
		{
			calcCheckingWithdraw(amount);
			System.out.println("Updated Balance"+MoneyFormat.format(checkingBalance));
		}
		else
			System.out.println("Balance cannot be negative");    
	}
	
	/*take the amount to withdraw from saving account */
	
	public void getSavingWithdrawInput() {
		System.out.println("saving balance :"+MoneyFormat.format(savingBalance));
	    System.out.println("Amount you want to withdraw from saving account");
		double amount=input.nextDouble();
		if(savingBalance-amount>=0)
		{
			calcSavingWithdraw(amount);
			System.out.println("Updated Balance"+MoneyFormat.format(savingBalance));
		}
		else
			System.out.println("Balance cannot be negative");    
	}
	
	/*take the amount to deposit into  checking account */
	
	public void getCheckingDepositInput() {
		System.out.println("checking balance :"+MoneyFormat.format(checkingBalance));
	    System.out.println("Amount you want to withdraw from checking account");
		double amount=input.nextDouble();
		if(checkingBalance+amount>=0)
		{
			calcCheckingDeposit(amount);
			System.out.println("Updated Balance"+MoneyFormat.format(checkingBalance));
		}
		else
			System.out.println("Balance cannot be negative");    
	}
	
	/*take the amount to deposit into saving account */
	
	public void getSavingDepositInput() {
		System.out.println("saving balance :"+MoneyFormat.format(checkingBalance));
	    System.out.println("Amount you want to withdraw from saving account");
		double amount=input.nextDouble();
		if(savingBalance+amount>=0)
		{
			calcSavingDeposit(amount);
			System.out.println("Updated Balance"+MoneyFormat.format(savingBalance));
		}
		else
			System.out.println("Balance cannot be negative");    
	}

}
