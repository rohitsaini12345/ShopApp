/* HallowPattern
*****
*   *
*   *
*   *
*****

*/

import java.util.Scanner;

public class HallowPattern {
  public static void main(String args[]) {
    int i, j, n;
    System.out.println("Enter a value of n:");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    for (i = 1; i <=n; i++) {
      for (j = 1; j <=n; j++) {
        if(i==1||j==1||i==n||j==n){
        System.out.print("*");
        }
        else
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}