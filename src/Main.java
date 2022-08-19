import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // first task

        int [] numbers = generateRandomArray();

        int allCoast = 0;

        for (int i = 0; i < numbers.length; i++) {
            allCoast = allCoast + numbers[i];
        }
        System.out.println("Сумма трат за месяц составила " + allCoast + " рублей" );

        // second task

        int maxCoast = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxCoast){
                maxCoast = numbers[i];
            }
        }

        int minCoast = maxCoast;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minCoast) {
                minCoast = numbers[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составил " + minCoast+  " рублей. " +
                "Максимальная сумма трат за день составила " + maxCoast + " рублей.");

        // third task

        double averageCoast = 0;

        averageCoast = (allCoast * 0.1) /(numbers.length);

        System.out.println("Средняя сумма трат за месяц составила " + averageCoast +  " рублей");

        // fourth task

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}