//Write a program to find out the area of Rectangle where length and  breadth of the Rectangle must be taken from user from command line argument..
public class AreaRectangle{
	public static void main(String []args){
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		double area = 2*num1*num2;
		System.out.println("Area of rectangle is " + area);
	}
}