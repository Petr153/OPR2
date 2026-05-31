package cz.osu.app;

import cz.osu.Exceptions.EmptyValueException;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private LocalDate date;
    private Customer customer;
    private List<Item> items;

    public Order(LocalDate date, Customer customer, List<Item> items) {
        this.date = date;
        this.customer = customer;
        this.items = items;
    }

    public double getOrderValue() {
        double sum = 0;

        for (Item item : items) {
            sum += item.getTotalPrice();
        }

        return sum;
    }

    public LocalDate getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }
}