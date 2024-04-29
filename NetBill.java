/*A whole-seller gives incentives in the form of discounts on the net bill. Write a program to input the net bill and calculate the discount as follows:

     Net Bill in Rupees			    Discount %
	<5000					5
	>=5000 and <10000			10
	>=10000					15

Display Discount %, Discount Amount and Amount Payable.*/


public class NetBill{
	public static void main(String args[]){
	int bill = Integer.parseInt(args[0]);
	
	if (bill<5000){
        int discount =5;
	int discAmount= (bill*discount)/100;
	int amount = bill-discAmount; 
	System.out.println("Discount given by shopkeeper is" + discount +"%");
	System.out.println("Discount Amount  = " +discAmount);
	System.out.println("Amount Payable  = " +amount);
	}
	
	else if (bill>=5000 && bill<10000){
        int discount =10;
	int discAmount= (bill*discount)/100;
	int amount = bill-discAmount; 
	System.out.println("Discount given by shopkeeper is" + discount+"%");
	System.out.println("Discount Amount  = " +discAmount);
	System.out.println("Amount Payable  = " +amount);
	}
	
	else{
        int discount =15;
	int discAmount= (bill*discount)/100;
	int amount = bill-discAmount; 
	System.out.println("Discount given by shopkeeper is" + discount +"%");
	System.out.println("Discount Amount  = " +discAmount);
	System.out.println("Amount Payable  = " +amount);
	}
	



	}
}