import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type in an integer: ");
        long value = input.nextLong();
        if (value%2 == 0){
            System.out.println("It's an even number.");
        }else {
            System.out.println("It's an odd number.");
        }

    }
}
