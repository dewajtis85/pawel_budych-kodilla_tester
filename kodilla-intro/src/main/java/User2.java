public class User2 {
    String name;
    double age;
    double height;

    public User2(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void describeUser() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
