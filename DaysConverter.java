//Write a program in java to input number of days. Find and display number of years, months and days.

public class DaysConverter {
    public static void main(String[] args) {
        int totalDays = Integer.parseInt(args[0]);
        int years =  totalDays / 365;
        int remainingDays =  totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;
        System.out.println(" " + years + " year "  + months +" Months " + days + " Days " );
        
        
    }
}
