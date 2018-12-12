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
	public void setCustomerNumber(int customerNumber)
	{
		this.customerNumber=customerNumber;
	}
	
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
	
	public double getCheckingBalance()
	{
		return checkingBalance;
	}
	
	public double getSavingBalance()
	{
		return savingBalance;
	}
	
	public void calcCheckingWithdraw(double number)
	{
		checkingBalance-=number;
	}
	public void calcSavingWithdraw(double number)
	{
		savingBalance-=number;
	}
	public void calcCheckingDeposit(double number)
	{
		checkingBalance+=number;
	}
	public void calcSavingDeposit(double number)
	{
		savingBalance+=number;
	}
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
