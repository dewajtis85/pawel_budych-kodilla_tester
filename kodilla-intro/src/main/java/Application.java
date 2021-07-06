        public class Application {
        String name;
        double age;
        double height;

        public Application(String name, double age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public static void main(String[] args) {
            Application adam = new Application("Adam", 40.5, 178);
            adam.checkName();
            adam.checkAge();
            adam.checkHeight();
        }

        public void checkName() {
            if (this.name == "Adam") {
                System.out.println("This is the guy.");
            } else {
                System.out.println("This is not the guy.");
            }
        }

        public void checkAge() {
            if (this.age < 45) {
                System.out.println("This guy is still young.");
            } else {
                System.out.println("This guy is already old.");
            }
        }

        public void checkHeight() {
            if (this.height > 175) {
                System.out.println("This guy is tall.");
            } else {
                System.out.println("This guy is short.");
            }
        }
    }

