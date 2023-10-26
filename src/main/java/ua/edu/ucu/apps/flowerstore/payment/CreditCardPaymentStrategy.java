package ua.edu.ucu.apps.flowerstore.payment;

public class CreditCardPaymentStrategy implements Payment{
    public String pay(double price){
        return "Paid";
    }
}
