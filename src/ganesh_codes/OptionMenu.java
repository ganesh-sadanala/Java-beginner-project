package ganesh_codes;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
       
		Scanner MenuInput=new Scanner(System.in);
       public DecimalFormat MoneyFormat=new DecimalFormat("$#,##0.00");
        HashMap<Integer,Integer>data=new HashMap<>();
	    public void getLogin() throws IOException
	    {   int x=1;
	    	do {
	             try {
	             data.put(91824350,1648);
	             data.put(1267346, 6479);
	    		System.out.println("Welcome to the ATM Project!");
	    		System.out.println("Enter your customer number");
	    		setCustomerNumber(MenuInput.nextInt());
	    		System.out.println("Enter your pin number");
	    		setPinNumber(MenuInput.nextInt());
	             }catch(Exception e)
	             {
	            	 System.out.println("You have entered wrong credentials");
	                 x=2;
	             }
	             for(Map.Entry<Integer,Integer> entry:data.entrySet())
	             {
	            	 if(entry.getKey()==getAccountNumber()&&entry.getValue()==getPinNumber())
	            		 getAccountType();
	             }
	    	}while(x==1);
	    }
		private void getAccountType() {
			// TODO Auto-generated method stub
			System.out.println("Select the account you want to access");
			System.out.println("Type 1:Checking Account");
			System.out.println("Type 2:Saving Account");
			System.out.println("Type 3:Exit");
			System.out.println("Choice");
			switch(MenuInput.nextInt())
			{
			case 1:getChecking();break;
			case 2:getSaving();break;
			case 3:System.out.println("Thank you for using the ATM!Bye😊");break;
			default:System.out.println("Invalid selection");
			   getAccountType();
			}
				}
		private void getSaving() {
			// TODO Auto-generated method stub
			System.out.println("Saving Account");
			System.out.println("Type 1:View Balance");
			System.out.println("Type 2:Withdraw Funds");
			System.out.println("Type 3:Deposit Funds");
			System.out.println("Type 4:Exit");
			
			switch(MenuInput.nextInt())
			{
			case 1:System.out.println("Saving Account Balance:"+MoneyFormat.format(getSavingBalance()));
			       getAccountType();
			break;
			case 2:getSavingWithdrawInput();
			       getAccountType();break;
			case 3:getSavingDepositInput();
			       getAccountType();break;
			case 4:System.out.println("Thank you for using the ATM!Bye 😁");
			       break;
			default :System.out.println("Invalid Choice");
			     getSaving();
			}

		}
		private void getChecking() {
			// TODO Auto-generated method stub
			System.out.println("Checking Account");
			System.out.println("Type 1:View Balance");
			System.out.println("Type 2:Withdraw Funds");
			System.out.println("Type 3:Deposit Funds");
			System.out.println("Type 4:Exit");
			
			switch(MenuInput.nextInt())
			{
			case 1:System.out.println("Checking Account Balance:"+MoneyFormat.format(getCheckingBalance()));
		       getAccountType();
		break;
		case 2:getCheckingWithdrawInput();
		       getAccountType();break;
		case 3:getCheckingDepositInput();
		       getAccountType();break;
		case 4:System.out.println("Thank you for using the ATM!Bye 😁");
		       break;
		default :System.out.println("Invalid Choice");
		     getChecking();
		}

			}
		}
	

