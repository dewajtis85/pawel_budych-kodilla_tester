public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2019 );
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.bestOne();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2021);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.bestOne();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(1600, 500, 2017);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.bestOne();
        oldNotebook.checkWeight();

    }
}