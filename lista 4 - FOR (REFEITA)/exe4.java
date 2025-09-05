
import java.util.Scanner;

public class exe4 {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

         int num1;
         int num2;

         System.out.println(" DIGITE O PRIMEIRO NÚMERO ");
         num1 = scn.nextInt();
         System.out.println(" DIGITE O SEGUNDO NÚMERO ");
         num2 = scn.nextInt();
          System.out.println("OS NÚMEROS EXISTENTES ENTRE " + num1 + " E " + num2 + " É ");
         for(int p = num1 + 1; p<= num2 - 1; p++){
          System.out.println( p );
         }
     }
     
}
/*FEITO!!! */