public class SellingPrice{
	public static void main(String args[]){
	double costPrice = 32500;
	double profitPercent = 27;
	double vatPercent = 12.7;
	double serviceChargepercent = 3.87;
	double profit=(costPrice*profitPercent)/100;
	double vat = (costPrice*vatPercent)/100;
        double serviceCharge = (costPrice*serviceChargepercent)/100;
	double sellingPrice = costPrice+profit+vat+serviceCharge;
	System.out.println("Profit = " +profit);
	System.out.println("Vat = " +vat);
	System.out.println("Service Charge = " +serviceCharge);
	System.out.println("Selling price  = " +sellingPrice);



	}
}