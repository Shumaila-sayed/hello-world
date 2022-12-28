import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and
// the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.


public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers (Type 0 to dismiss): ");
        int n = 0;
        int even = 0;
        int odd = 0 ;
        int neg = 0;
        while((n = in.nextInt()) != 0) {
            if(n>0 && n%2 == 0){
                even = n + even;
            } else if (n>0 && n%2 != 0) {
                odd = n + odd;
            }
            if(n<0){
                neg = n+neg;
            }
        }

        System.out.println("Sum of negative number is "+ neg);
        System.out.println("Sum of Positive even number is "+ even);
        System.out.println("Sum of Positive odd number is "+ odd);
    }
}
