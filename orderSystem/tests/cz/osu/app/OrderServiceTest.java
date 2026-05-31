package cz.osu.app;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @org.junit.jupiter.api.Test
    void totalOrdersValue() {
        Customer customer = new Customer("Jan", "jan@test.cz");
        Customer customer2 = new Customer("Jan2", "jan2@test.cz");

        OrderService service = new OrderService();

        Item item = new Item("Notebook", 2, 10000);
        Order order = new Order(LocalDate.now(), customer, List.of(item));

        Item item2 = new Item("Monitor", 1, 1000);
        Order order2 = new Order(LocalDate.now(), customer2, List.of(item2));

        service.addOrder(order);
        service.addOrder(order2);


        assertEquals(21000, service.totalOrdersValue());

    }

    @org.junit.jupiter.api.Test
    void averageOrderValue() {
        Customer customer = new Customer("Jan", "jan@test.cz");
        Customer customer2 = new Customer("Jan2", "jan2@test.cz");

        OrderService service = new OrderService();

        Item item = new Item("Notebook", 2, 10000);
        Order order = new Order(LocalDate.now(), customer, List.of(item));

        Item item2 = new Item("Monitor", 1, 1000);
        Order order2 = new Order(LocalDate.now(), customer2, List.of(item2));

        service.addOrder(order);
        service.addOrder(order2);

        assertEquals(10500, service.averageOrderValue());
    }

    @org.junit.jupiter.api.Test
    void mostSoldProduct() {
        Customer customer = new Customer("Jan", "jan@test.cz");
        Customer customer2 = new Customer("Jan2", "jan2@test.cz");
        Customer customer3 = new Customer("Jan3", "jan3@test.cz");


        OrderService service = new OrderService();

        Item item = new Item("Notebook", 4, 10000);
        Order order = new Order(LocalDate.now(), customer, List.of(item));

        Item item2 = new Item("Monitor", 2, 1000);
        Order order2 = new Order(LocalDate.now(), customer2, List.of(item2));

        Item item3 = new Item("Monitor", 3, 1000);
        Order order3 = new Order(LocalDate.now(), customer3, List.of(item3));

        service.addOrder(order);
        service.addOrder(order2);
        service.addOrder(order3);

        assertEquals("Monitor", service.mostSoldProduct());
    }
}