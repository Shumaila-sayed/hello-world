import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
          pythagorean();

    }

        static void pythagorean(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter triplet: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int num3 = in.nextInt();

            int sum = (num1*num1)+(num2*num2);
            if (sum == (num3*num3)){
                System.out.println("This triplet is a pythagorean triplet" );
            }else {
                System.out.println("This triplet is not a pythagorean triplet");
            }

        }

}
