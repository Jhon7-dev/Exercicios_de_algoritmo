/*calcular a área do círculo */

import java.util.Scanner;

public class exe8 {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

      double pi = 3.14;
      double raio ;
      double area;
     
      System.out.println("DIGITE O RAIO DA CIRCUNFERÊNCIA: ");
      raio = scn.nextInt();
      area = 2*pi*raio;
      System.out.println("A ÁREA DA CIRCUNFERÊNCIA É " + area);
     }
}
