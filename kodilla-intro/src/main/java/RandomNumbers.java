import java.util.Random;

public class RandomNumbers {
    int min = 30;
    int max = 0;
    public void init() {

        Random random = new Random();

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
    }
    public int getMin() {
        return min;
    }

    public int getMax(){
        return max;
    }



}




