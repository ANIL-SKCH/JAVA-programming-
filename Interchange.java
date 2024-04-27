public class Interchange{
	public static void main(String args[]){
        
       	double num1=Double.parseDouble(args[0]);
        double num2 =Double.parseDouble(args[1]);
         num1=num1+num2;
          num2=num1-num2;
           num1=num1-num2;

       
     
       	System.out.println("num1= "+ num1);
		System.out.println("num2= "+ num2);
		
	}
}