package app;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insira as informações do cliente:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.next();
        System.out.print("Data de nascimento: ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Insira as informações do pedido: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("Quantos itens o produto vai ter? ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Insira #" + (i+1) + " item:");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Preço do produto: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);

        }

        System.out.println();
        System.out.println(order);

        sc.close();

    }
}
