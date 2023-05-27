import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input  your name");
        String username = scanner.nextLine();
        Scanner secondScanner = new Scanner(System.in);
        System.out.print("Hello, " + username + " what is your age? > ");
        int age = secondScanner.nextInt();
        System.out.println("Your name is " + username + " and you are " + age + " years old.");
    }
}
