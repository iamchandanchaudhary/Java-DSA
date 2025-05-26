import java.util.*;

class Prime {
  public static void main(String args[]) {

      System.out.println("Prime Number from till N :- \n");
    
      Scanner sc = new Scanner(System.in);

      int i, j, count = 0;
      int n = sc.nextInt();
    
      for(i = 1; i <= n; i++) {
        for(j = 2; j < i; j++) {
          if(i % j == 0) {
            break;
          }
        }
        
        if(i == j) {
          System.out.print(i + " ");
          count++;
        }
      }
      System.out.println("\nTotal Prime: " + count);
  }
}