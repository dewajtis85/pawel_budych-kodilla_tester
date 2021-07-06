public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[5];
        movies[0] = "The Wolf of Wall Street";
        movies[1] = "Scarface";
        movies[2] = "Layer Cake";
        movies[3] = "Boogie Nights";
        movies[4] = "Wild Things";
        String movie = movies[3];
        System.out.println(movie);

        int numberOfElements = movies.length;
        System.out.print("Moja tablica zawiera ");
        System.out.print(numberOfElements) ;
        System.out.print(" filmów.");
}
}
