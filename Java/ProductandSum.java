import java.util.Scanner;

public class ProductandSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int val = in.nextInt();
        int sum = 0;
        int product = 1;
        int ans = 0;

        while(val>0){
            int rem = val%10;
            val /= 10;
            product *= rem;
            sum += rem;
        }
        System.out.println(ans = product-sum);
    }
}
