package cz.osu;

import cz.osu.app.Customer;
import cz.osu.app.Item;
import cz.osu.app.Order;
import cz.osu.app.OrderService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        OrderService service = new OrderService();

        try {
            while (true) {
                System.out.println("Zadat objednávku: zákazník(žádná hodnota nesmí být prázdná)");
                System.out.print("Jméno zákazníka: ");
                String name = sc.nextLine();

                System.out.print("Email zákazníka (musí obsahovat @ a končit .cz nebo .com): ");
                String email = sc.nextLine();

                Customer customer = new Customer(name, email);

                List<Item> items = new ArrayList<>();

                while (true) {
                    System.out.println("Vložit nový produkt do objednávky: ");
                    System.out.print("Název produktu (alespoň 3 znaky): ");
                    String productName = sc.nextLine();

                    System.out.print("Počet (nesmí být záporný): ");
                    int amount = Integer.parseInt(sc.nextLine());

                    System.out.print("Cena (nesmí být záporná): ");
                    double price = Double.parseDouble(sc.nextLine());

                    items.add(new Item(productName, amount, price));

                    System.out.print("Vložit další produkt do objednávky? ANO/NE ");
                    String decision = sc.nextLine();

                    if (decision.equalsIgnoreCase("NE")) {
                        break;
                    }
                }

                Order order = new Order(LocalDate.now(), customer, items);
                service.addOrder(order);

                System.out.print("Vytvořit novou objednávku? ANO/NE ");
                String decision = sc.nextLine();

                if (decision.equalsIgnoreCase("NE")) {
                    break;
                }
            }

            System.out.println("Celková hodnota všech objednávek: " + service.totalOrdersValue());

            System.out.println("Průměrná hodnota objednávky: " + service.averageOrderValue());

            System.out.println("Nejvíce prodávaný produkt: " + service.mostSoldProduct());

            System.out.print("Jak pojmenovat csv soubor? ");
            String name = sc.nextLine();
            service.exportToCsv(name);

        } catch(Exception e){
            System.out.println("Chyba: " + e.getMessage());
        }
    }
}
