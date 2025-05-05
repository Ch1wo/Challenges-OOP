import java.util.Scanner;

class UserInfo {
    Scanner scanner = new Scanner(System.in);

    public void askDetails() {
        String name;
        int age;

        System.out.print("What is your name? ");
        name = scanner.next();

        System.out.print("How old are you? ");
        age = scanner.nextInt();

        System.out.println("Hello " + name + "!");

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }

    public static void main(String[] args) {
        (new UserInfo()).askDetails();
    }
}
