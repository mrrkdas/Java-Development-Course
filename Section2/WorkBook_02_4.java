package Section2;

public class WorkBook_02_4 {
    public static void main(String[] args) {
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        int rounded_sales = (int) sales;
        int rounded_profits = (int) profit;
        int rounded_refunds = (int) refunds;
        int rounded_shipping = (int) shipping;


        System.out.println("This month, we made $" + (rounded_sales) + " in sales");
        System.out.println("Factoring in costs, we made $" + (rounded_profits) + "in profit");
        System.out.println("The refunds are at a low $" + (rounded_refunds) + " .This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + (rounded_shipping) + " in shipping");


    }
}