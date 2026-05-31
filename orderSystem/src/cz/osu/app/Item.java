package cz.osu.app;

import cz.osu.Exceptions.EmptyValueException;
import cz.osu.Exceptions.NegativeValueException;
import cz.osu.Exceptions.ShortProductNameException;

public class Item {

    private String productName;
    private int amount;
    private double price;

    public Item(String productName, int amount, double price) throws EmptyValueException, ShortProductNameException,
            NegativeValueException {

        if (productName == null || productName.isBlank()) {
            throw new EmptyValueException("Název produktu nesmí být prázdný");
        }

        if (productName.length() < 3) {
            throw new ShortProductNameException("Název produktu musí mít alespoň 3 znaky");
        }

        if (amount < 0 || price < 0) {
            throw new NegativeValueException("Cena ani počet nesmí být záporné");
        }

        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return amount * price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}