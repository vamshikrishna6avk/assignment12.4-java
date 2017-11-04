/*program for creating bankatm with properties atmid,bankname,location,balance
 * methods are withdraw(double amt),deposit(double amt)
 */
package atmexception;//created package as atmexception

import java.util.Scanner;//import scanner class is in util folder inside the java folder
//util contains utility classes
//scanner is a predefined class for taking inputs from user
                            //here I'm creating a class BankAtm
                            //classes are basics of opps(object oriented program)
public class BankAtm {
	int atmId;
	String bankName; //taking variables of BankAtm details
	String location;
	double balance;
	double amount;
	public void  BankAtm(){     //crating a default constructor
		atmId = 1;//taking values
		bankName = "0";
		location = "0";
		balance = 12000;
		amount =0;			
		}
	BankAtm(double bal,int num,String abc,String xyz,double amt){
		balance =bal; //here I'm taking a parameterized constructor
		atmId = num;
	}
	 public void deposit(double amount){            //    here creating a method of deposit
			//Here public is a access modifier which defines who can access this method
			//void is used to define return type of the method,void means method wont return any value

			
		 balance = balance+amount;//balanceequal to balance plus amount
		 System.out.println("money deposited succesfully: " +balance); //and depositing the amount
		                                                     
	 }
	 public void withdraw(double amount) throws InsufficientBalanceException{
		                  //here creating the method withdraw amount which throws an exception if the balance is less than 10000
		
		 if(balance-amount <12000){
			 throw new InsufficientBalanceException("withdrawal failure is you have insufficient balance.your balance is Rs. "+amount);
		 }      //which handles the exception
	 
	 else {
		 balance = balance-amount;      //it shows  the available balance after withdrawn the amount
		 System.out.println("money withdrawn::availabe balance Rs."+balance);
		                                                          //system is used to return code
		                                                         //out is a static member
		                                                         //println is used to print text and gives output
		 
	 }
	 
}
	
	}

		
	
