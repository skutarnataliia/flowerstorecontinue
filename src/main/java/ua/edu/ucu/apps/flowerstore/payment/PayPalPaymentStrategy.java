package ua.edu.ucu.apps.flowerstore.payment;

public class PayPalPaymentStrategy implements Payment{
    public String pay(double price){
        return "Paid";
    }
}
