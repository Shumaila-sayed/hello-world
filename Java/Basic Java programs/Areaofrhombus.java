import java.util.Scanner;

public class Areaofrhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of 2 diagonals: ");
        int d1 = in.nextInt();
        int d2 = in.nextInt();

        int a = (d1 * d2)/2 ;
        System.out.println("Area of rhombus is : " + a);
    }
}
