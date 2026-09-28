public static void main(String[] args) {
    int[][] weight = {{10, 20, 27}, {22, 5, 20}, {30, 20, 10}};
    String[] Gym = {"GYM 1", "GYM 2", "GYM 3"};
    String[] months = {"MONTH 1", "MONTH 2", "MONTH 3", "TOTAL", "AVG", "MIN", "MAX"};
    int total = 0;
    int min = 0;
    int max = 0;
    double avg = 0;

    System.out.println("***************************************************************************************************************************");
    System.out.println("GYM WEIGHTLOSS APPLICATION");
    System.out.println("***************************************************************************************************************************");

    System.out.printf("%-14s", "");
    for (int month = 0; month < months.length; month++) {

        System.out.printf("%-16s", months[month]);
    }
    System.out.println();

    for (int i = 0; i < weight.length; i++) {
        System.out.printf("%-15s", Gym[i]);

        for (int j = 0; j < weight[i].length; j++) {
            System.out.printf("%-16s", weight[i][j] + "kg");
        }

        total = 0;
        min = weight[i][0];
        max = weight[i][0];
        for (int j = 0; j < weight[i].length; j++) {
            total += weight[i][j];
            if (weight[i][j] < min) min = weight[i][j];
            if (weight[i][j] > max) max = weight[i][j];
        }
        avg = (double) total / weight[i].length;

        System.out.printf("%-16s", total + "kg");
        System.out.printf("%-16s", String.format("%.2f", avg) + "kg");
        System.out.printf("%-16s", min + "kg");
        System.out.printf("%-16s", max + "kg");

        System.out.println();
    }
}