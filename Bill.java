public class Bill{
	public static void main(String [] args){
        int chickenroll= 60;
	int vegpuff = 25;
        int item1=Integer.parseInt(args[0]);
	int item2=Integer.parseInt(args[1]);
	int cr = item1*chickenroll;
	int vp = item2*vegpuff;
	System.out.println("--------------------BILL--------------------");
	System.out.println("Price of the chicken roll =" + cr);
	System.out.println("Price of the veg puff =" + vp);
	int itembill= cr + vp;
	System.out.println("item bill = "+itembill);
	System.out.println("-----Total Bill after Applying Discount-----");
	double discount = Double.parseDouble(args[2]);
        double discountAmount = (itembill*discount)/100;
		double totalbill = itembill-discountAmount;
        System.out.println("TotaL bill = "+totalbill);

	}
}