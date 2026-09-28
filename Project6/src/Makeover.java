public static void main(String[] args) {

    String[] Room = {"BATHROOM", "KITCHEN", "GARDEN"};
    int[][] Makeovers = {{8, 2, 5}, {7, 4, 5}, {5, 5, 2}, {2, 2, 3}, {7, 7, 9}, {7, 8, 5}};
    String[] Months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY","JUNE"};
    System.out.println("************************************************************************************************************************************");
    System.out.println("MAKEOVERS REPORT");
    System.out.println("************************************************************************************************************************************");

    System.out.printf("%-18s", " ");
    System.out.printf("%-13s%-16s%-12s\n", " BATHRROM", "KITCHEN", "GARDEN");

    for (int row = 0; row < Months.length; row++) {
        System.out.printf("%-18s", Months[row]);


        for (int col = 0; col < Room.length; col++) {
            System.out.printf("%-18s", Makeovers[row][col]);

        }
        System.out.println();
    }

    System.out.println("***********************************************************************************************************************************************");
    System.out.println("TOTAL MAKEOVERS REPORT");
    System.out.println("***********************************************************************************************************************************************");

    for (int i = 0; i < Months.length; i++) {
        int Total = 0;
        for (int j = 0;j < Makeovers[i].length; j++){
            Total += Makeovers[i][j];

        }
        System.out.println(Months[i] + ":" + Total);
    }
}









