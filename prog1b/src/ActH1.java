public class ActH1 {
    public static void main(String[] args) {
        int[][] sales = {{25, 15, 35}, {25, 55, 35}, {17, 27, 25}, {11, 20, 45}};
        String[] months = {"JAN", "FEB", "MAR" };
        String[] Cars = {"SUV", "COUPE", "SEDAN", "VAN" };
        int total = 0;
        int sum = 0;
        System.out.println("*******************************************************************************************************************************************************");
        System.out.println(" CAR SALES REPORT");
        System.out.println("*******************************************************************************************************************************************************");


        System.out.printf("%-10s", "");
        for (int month = 0; month < months.length; month++) {
            System.out.printf("%-10s", months[month]);
        }
        System.out.println();

        for (int car = 0; car < Cars.length; car++) {
            System.out.printf("%-10s", Cars[car]);


            for (int sale = 0; sale < months.length; sale++) {
                System.out.printf("%-10s", sales[car][sale]);
            }
            System.out.println();
        }


        }

    }






























