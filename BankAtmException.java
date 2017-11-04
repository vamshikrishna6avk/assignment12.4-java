package atmexception;//created package atmexception

public class BankAtmException {     //creating a class BankAtmException
	                               //classes are the basics of opps(object oriented program)
	public static void main(String[]args){		
		 BankAtm vamshi = new BankAtm (30000,1,"vamshi","hyd",10000);   //creating objects which shows the details
		 BankAtm krishna = new BankAtm (12000,2,"krishna","hyd",20000);
		 BankAtm kranthi = new BankAtm (2000,3,"kranthi","hyd",1000);
		  
		 vamshi.deposit(1000);//her I'm depositing the amount
		 try
		 {
			 vamshi.withdraw(1300);          //here the withdrawal throws an Exception with try catch showing the withdrawn amount 
			 krishna.withdraw(4000);
			 kranthi.withdraw(700);
		 }
		 catch (InsufficientBalanceException e){     //here it catch the exception which occurs in the output and shows insufficient balance
			 System.out.println("insufficient balance:");//system is used to return code
			                                            //out is a static member
			                                            //println is used to print text and gives output
		 }
	}

}