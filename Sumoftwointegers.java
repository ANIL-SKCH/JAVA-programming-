public class Sumoftwointegers{
	public static void main(String [] args){
	int sum=0;
	int num= Integer.parseInt(args[0]);
	int rem=num%10;
	sum = sum+rem;
	num=num/10;
	sum=sum+num;
	System.out.println("Sum of the two integers are" + sum);
	}
}