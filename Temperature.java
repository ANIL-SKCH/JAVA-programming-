public class Temperature {
    public static void main(String[] args) {
        double fahrenheit= Double.parseDouble(args[0]);
        double celsius = (fahrenheit-32)*5/9;
        System.out.println(celsius);
    }


}