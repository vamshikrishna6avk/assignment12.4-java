package atmexception;//created package atmexception
//by extending the class,we can make the class as Exception
public class InsufficientBalanceException  extends Exception{ //as im extending the class INsufficientBalanceException class
	
String message ;                        //in this creating constructors 
public InsufficientBalanceException(){
	System.out.println("Exception Constructor called"); //which shows a message 
	//system is used to return code
    //out is a static member
    
	               
}
 public InsufficientBalanceException(String message){
	 this.message=message;//using this keyword
	 System.out.println("Exception thrown with message" +getMessage());
    printStackTrace();//prints several lines in output console
}
}
