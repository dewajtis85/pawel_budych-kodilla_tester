import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int min = 30;
        int max = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;

            if (temp > max) {
                max = temp;
            }

            if (temp < min) {
                min = temp;
            }
        }
            System.out.println("Najniższa wylosowania liczba to " + min + ".");
            System.out.println("Najwyższa wylosowania liczba to " + max + ".");

            System.out.println(sum);



    }
}




