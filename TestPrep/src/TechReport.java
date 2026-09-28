public class TechReport {
    public static void main(String[] args) {
        int[][] prices = {{10500, 8500}, {9500, 7200}, {12000, 8000}};
        String[] brands = {"CANNON", "SONY", "NIKON"};
        String[] techs = {"MIRRORLESS", "DSLR"};

        System.out.println("************************************************************************************************************************************************");
        System.out.println("CAMERA TECH REPORT");
        System.out.println("************************************************************************************************************************************************");

        System.out.printf("%-18s", " ");
        System.out.printf("%-18s", "MIRRORLESS" + "     " + "DSLR");


        System.out.println();


        for (int row = 0; row < brands.length; row++) {
            System.out.println();
            System.out.printf("%-18s", brands[row]);

            for (int col = 0; col < techs.length; col++) {
                System.out.printf("%-18d", prices[row][col]);

            }

  System.out.println();

        }
        System.out.println("************************************************************************************************************************************************");
        System.out.println("CAMERA TECH RESULTS");
        System.out.println("************************************************************************************************************************************************");

        double greatesDiff = 0;
        String greatestBrand = "";


        for (int row = 0; row < brands.length; row++) {
            double diff = prices[row][0] - prices[row][1];
            if (diff < 0) {
                diff = -diff;
            }

            System.out.printf("%-10sR %.2f", brands[row], diff);
            if (diff >= 2500) {
                System.out.print("***");
            }
            System.out.println();
            if (diff > greatesDiff) {
                greatesDiff = diff;
                greatestBrand = brands[row];
            }


        }

        System.out.println();
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + greatestBrand);


    }
}