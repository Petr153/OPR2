package cz.osu.app;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class OrderService {

    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public double totalOrdersValue() {
        double sum = 0;

        for (Order order : orders) {
            sum += order.getOrderValue();
        }
        return sum;
    }

    public double averageOrderValue() {
        if (orders.isEmpty()) {
            return 0;
        }

        return totalOrdersValue() / orders.size();
    }

    public String mostSoldProduct() {

        Map<String, Integer> soldProducts = new HashMap<>();

        for (Order order : orders) {
            for (Item item : order.getItems()) {

                soldProducts.put(item.getProductName(), soldProducts.getOrDefault(item.getProductName(), 0) + item.getAmount());
            }
        }

        String mostSold = "Žádný produkt";
        int maxCount = 0;

        for (Map.Entry<String, Integer> item : soldProducts.entrySet()) {

            if (item.getValue() > maxCount) {
                maxCount = item.getValue();
                mostSold = item.getKey();
            }
        }
        return mostSold;
    }

    public void exportToCsv(String fileName) throws IOException {

        FileWriter writer = new FileWriter(fileName + ".csv");

        writer.write("Datum"  + ";" + "Zakaznik"  + ";" + "Polozky objednavky\n");

        for (Order order : orders) {

            writer.write(order.getDate() + ";" + order.getCustomer().toString()  + ";" + order.getItems().toString() + "\n");
        }

        writer.close();
    }
}