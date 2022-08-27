package package1;
import java.util.Scanner;

public class simple_bank_tasks 
{
	public double total=0;
	public void Index(String username,int userid){
	System.out.println("Hello "+username);
	System.out.println("Your Id is:"+userid);
	int option;
 do {
	System.out.println("--------------------------------");
	System.out.println("Choose an option");
	System.out.println("1).Bank Balance");
	System.out.println("2).Money Deposit");
	System.out.println("3).Money Withdraw");
	System.out.println("4).Exit");

	
	
	Scanner sc=new Scanner(System.in);
	option =sc.nextInt();

	switch(option) {
	case 1: System.out.println("-----------------");
	        System.out.println("You have selected Bank Balance option: ");
	        double bb= bankbalance();
	        System.out.println("Your bank balance: "+bb);
	        break;
	case 2: System.out.println("-----------------");
             System.out.println("You have selected Money Deposit option: ");
             System.out.println("Enter the amount to be deposited:");
             double bd= bankdeposite();
             System.out.println("Money Deposited");
             System.out.println("Your bank balance: "+bd);
             break;
	case 3:  System.out.println("-----------------");
             System.out.println("You have selected Money Withdraw option: ");
             System.out.println("Enter the amount to be withdrawn:");
             double bw= bankwithdraw();
             System.out.println("Your bank balance: "+bw);
             break;
	case 4:  System.out.println("-----------------");
	         System.out.println("Thank you");
	         break;
	 default:System.out.println("Choose correct option");
	 }
 }
while(option !=4);
}
	
    
             
  
public double bankbalance() {
	return total;
}
public double bankdeposite(){  
	Scanner s=new Scanner(System.in);
	double vel=s.nextDouble();
	total=total+vel;
	return total;
}
public double bankwithdraw() {
	Scanner s=new Scanner(System.in);
	double draw=s.nextDouble();
	if(total<draw) {
	   System.out.println("Insufficient balance ");
	   
	}
	else if(total>draw) {
	 total= total-draw;
	 System.out.println("Rs"+draw+" withdrawn successfully");
	}
	return total;
	
}
public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Name and userid to access the account");
	    String username=s.nextLine();
		int userid =s.nextInt();
		simple_bank_tasks bank=new simple_bank_tasks();
        bank.Index(username,userid);
	}	
}
