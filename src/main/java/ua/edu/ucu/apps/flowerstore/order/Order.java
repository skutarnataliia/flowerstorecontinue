package ua.edu.ucu.apps.flowerstore.order;

import java.util.Iterator;
import java.util.LinkedList;

import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.flowers.Item;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

@Setter
public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double price = 0;
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            price = price + item.getPrice();
        }
        return price;
    }
}
