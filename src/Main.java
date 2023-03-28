import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner KEYBOARD = new Scanner(System.in);
        System.out.println("Introduce un número:");
        String number = KEYBOARD.nextLine();
        System.out.println("Hola Mundo " + number + "!");
        KEYBOARD.close();

    }
}