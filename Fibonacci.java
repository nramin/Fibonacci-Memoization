import java.util.*;

public class Fibonacci {

   public static Map<Integer, Long> memo = new HashMap<Integer, Long>();

   public static void main(String[] args) {
      System.out.println(fibonacci(45));
   }
   
   public static long fibonacci(int n) {
      if (n <= 1) {
         return n;
      } else {
         long value;
         if (memo.get(n) != null) {
            value = memo.get(n);
         } else {
            value = fibonacci(n-1) + fibonacci(n-2);
            memo.put(n, value);
         }
         return value;
      }
   }
}