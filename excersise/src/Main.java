public class Main {

    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 55, 83, 78};


        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        int sum = 0;
        int largest = numbers[0];
        int smallest = numbers[0];


        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];


            if (numbers[i] > largest) {
                largest = numbers[i];
            }


            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }


        double average = (double) sum / numbers.length;


        System.out.println("3. Total sum of all elements: " + sum);
        System.out.println("4. Largest number: " + largest);
        System.out.println("   Smallest number: " + smallest);
        System.out.println("5. Average of the array elements: " + average);
    }
}
