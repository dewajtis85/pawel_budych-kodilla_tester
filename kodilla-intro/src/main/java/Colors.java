import java.util.Scanner;
public class Colors {


    public static String getColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj pierwszą literę koloru (R-red, B-black, G-green, P-purple):");
            String color = scanner.nextLine();
            switch (color) {
                case "R":
                    return "RED";

                case "B":
                    return "BLACK";

                case "G":
                    return "GREEN";

                case "P":
                    return "PURPLE";

                default:
                    System.out.println("Spróbuj ponownie.");
            }

            return color;
        }
    }
}




