package ua.edu.ucu.apps.payment;

public class PayPalPaymentStrategy implements Payment {
    public String pay(double price){
        StringBuilder str = new StringBuilder();
        str.append("Payed ");
        str.append(price);
        str.append(" with PayPal");
        return str.toString();   
    }    
}
