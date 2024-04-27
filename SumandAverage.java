//Write a program to find the sum and average of three numbers where  number must be taken from command line argument.
public class SumandAverage{
	public static void main(String []args){
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		int num3= Integer.parseInt(args[2]);
		int sum=num1+num2+num3;
		int avg = (num1+num2+num3)/3;
		System.out.println("Sum of three numbers is" + sum);
		System.out.println("Average of three numbers is" + avg);
	}
}