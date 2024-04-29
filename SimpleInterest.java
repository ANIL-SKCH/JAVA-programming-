/*Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and Amount.*/


public class SimpleInterest{
	public static void main(String args[]){
	int principal = Integer.parseInt(args[0]);
	int rate = Integer.parseInt(args[1]);
	int time = Integer.parseInt(args[2]);
	
	int simpleInterest = (principal*rate*time)/100;
	System.out.println("Simple Interest  = " +simpleInterest);
	int amount = simpleInterest+principal;
	System.out.println("Amount  = " +amount);



	}
}