import java.util.Arrays;

public class IceAct {
    public static void main(String[] args) {
        int[][] sales = {{100, 150, 70}, {88, 92, 103}, {75, 45, 90}, {65, 95, 175}};
        String[] brands = {"QUARTER", "NIKES", "ADIDAS", "REEBOK" };
        String[] Q = { "Q1", "Q2", "Q3", "Q4" };

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ULTIMATE SHOE SALES");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

     for (int i = 0; i < brands.length; i++) {
         System.out.printf("%-18s", brands[i]);

     }
     System.out.println();
        for (int q = 0; q < Q.length; q++) {
            System.out.printf("%-18s", Q[q]);

            for (int sale = 0; sale < sales[q].length; sale++) {
                System.out.printf("%-18d", sales[q][sale]);
            }

            System.out.println();
        }
        int nikeTotal = 0, adidasTotal = 0, reebokTotal = 0;

        int nikeMin = sales[0][0];
        int adidasMin = sales[0][1];
        int reebokMin = sales[0][2];

        int nikeMax = sales[0][0];
        int adidasMax = sales[0][1];
        int reebokMax = sales[0][2];

        for (int i = 0; i < sales.length; i++) {

            nikeTotal += sales[i][0];
            adidasTotal += sales[i][1];
            reebokTotal += sales[i][2];

            if (sales[i][0] < nikeMin)
                nikeMin = sales[i][0];
            if (sales[i][1] < adidasMin)
                adidasMin = sales[i][1];
            if (sales[i][2] < reebokMin)
                reebokMin = sales[i][2];

            if (sales[i][0] > nikeMax)
                nikeMax = sales[i][0];
            if (sales[i][1] > adidasMax)
                adidasMax = sales[i][1];
            if (sales[i][2] > reebokMax)
                reebokMax = sales[i][2];
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-12s%-12d%-12d%-12d%n", "TOTAL:", nikeTotal, adidasTotal, reebokTotal);
        System.out.printf("%-12s%-12.1f%-12.1f%-12.1f%n", "AVERAGE:",
                (double) nikeTotal / sales.length,
                (double) adidasTotal / sales.length,
                (double) reebokTotal / sales.length);
        System.out.printf("%-12s%-12d%-12d%-12d%n", "MIN:", nikeMin, adidasMin, reebokMin);
        System.out.printf("%-12s%-12d%-12d%-12d%n", "MAX:", nikeMax, adidasMax, reebokMax);
        System.out.println("-------------------------------------------------------------");


    }
}



