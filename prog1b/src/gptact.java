public class gptact {
    public static void main(String[] args) {
        int[] number = {1, 2, -3, 5, 7};

        int sum = 0;
        int multiplier = 1;
        double average = 0;
            for (int i = 0; i < number.length; i++) {
              sum += number[i];
            }
                  for (int i = 0; i < number.length; i++) {
                  multiplier *= number[i];
                 }
                    for (int i = 0; i < number.length; i++)
                        average =  (double) sum / number.length;
                System.out.println(sum);
            System.out.println(multiplier);
        System.out.println(average);
    }
}