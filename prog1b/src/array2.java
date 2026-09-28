public class array2 {
    public static void main(String[] args) {

        int[][] arrays = {{6, 12, 9, 15, 10}, {18, 3, 21, 17, 4}};

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Array " + (i + 1) + ":");

                 for (int j = 0; j < arrays[i].length; j++) {
                     System.out.print(arrays[i][j] + " ");
            }

            System.out.println();
        }
    }
}