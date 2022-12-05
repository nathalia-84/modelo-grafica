package app;

import entities.Client;
import entities.OrderItem;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Client maria = new Client (
                "Maria",
                "maria@gmail.com",
                sdf.parse("20/10/1995"));

        System.out.println(maria);


        /*
        System.out.println("Insira as informações do cliente:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento: ");
        System.out.print("Insira as informações do pedido: ");
        System.out.print("Status: ");
        System.out.print("Nome do produto: ");
        System.out.print("Preço do produto: ");
        System.out.print("Quantidade: "); */
        sc.close();

    }
}
