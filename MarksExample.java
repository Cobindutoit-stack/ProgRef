public class MarksExample {
    public static void main(String[] args) {
        int[][] marks = {{60, 75, 82}, {45, 58, 70}, {90, 88, 95}};
        String[] students = {"AMY", "BEN", "CARA"};
        String[] tests = {"TEST 1", "TEST 2", "TEST 3"};

        // print the table
        System.out.printf("%-10s", "");
        for (int t = 0; t < tests.length; t++) {
            System.out.printf("%-10s", tests[t]);
        }
        System.out.println();

        for (int s = 0; s < students.length; s++) {
            System.out.printf("%-10s", students[s]);
            for (int t = 0; t < tests.length; t++) {
                System.out.printf("%-10d", marks[s][t]);
            }
            System.out.println();
        }

        // start min and max at the first mark so we have something to compare against
        int total = 0;
        int min = marks[0][0];
        int max = marks[0][0];

        for (int s = 0; s < students.length; s++) {
            for (int t = 0; t < tests.length; t++) {
                int mark = marks[s][t];

                total += mark;        // add every mark to the total

                if (mark < min) {     // smaller than the smallest so far?
                    min = mark;
                }
                if (mark > max) {     // bigger than the biggest so far?
                    max = mark;
                }
            }
        }

        System.out.println();
        System.out.println("Total: " + total);
        System.out.println("Lowest mark: " + min);
        System.out.println("Highest mark: " + max);
    }
}
