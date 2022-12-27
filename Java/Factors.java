public class Factors {
    public static void main(String[] args) {
       int days = 31;
       int count = 0;

       while(days > 0) {
           int rem = days%2;
           if(rem == 0){
               count ++;

           }
       }System.out.println(count);

    }
}
