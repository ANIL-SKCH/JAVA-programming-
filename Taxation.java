//Write a program to calculate the tax for a taxable income of Rs.    9,90,000, if the tax rate is fixed at 4.9%.

public class Taxation{
	public static void main(String args[]){
        
       	double income=Double.parseDouble(args[0]);
        double rate =Double.parseDouble(args[1]);
        double tax = (income*rate)/100;
       
     
       	System.out.println("tax have to be pay is "+ tax);
		
	}
}
   