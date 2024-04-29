/*Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, Rs. 350 in coloring and added new accessories worth Rs. 500.
Rohan wants to make a profit of Rs. 1500 on selling the cycle. 
Find the selling price of the cycle. 
Write a java program to store all values and calculate and display the selling price.*/

public class SellingPrice2{
	public static void main(String args[]){
	int costPrice = 1200;
	int repairs = 250;
	int color = 350;
	int accessories = 500;
	int profit=1500;
	int totalCp = costPrice+repairs+color+accessories;
	System.out.println("Total cost price  = " +totalCp);
	int sellingPrice = costPrice+profit+repairs+color+accessories;
	System.out.println("Selling price  = " +sellingPrice);



	}
}