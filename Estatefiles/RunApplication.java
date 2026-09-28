import java.util.Scanner;

public class RunApplication
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current estate agent name: ");
        String name = input.nextLine();

        System.out.print("Enter the property price: ");
        double price = Double.parseDouble(input.nextLine());

        EstateAgentSales sale = new EstateAgentSales(name, price);
        sale.printPropertyReport();

        input.close();
    }
}
