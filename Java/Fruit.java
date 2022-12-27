import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        String color = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("red fruit");
            case "orange" -> {
                System.out.println("round fruit");
                switch (color) {
                    case "red" -> System.out.println("bright");
                    case "green" -> System.out.println("nature ");
                }
            }
            case "grapes" -> System.out.println("green round fruit");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}
