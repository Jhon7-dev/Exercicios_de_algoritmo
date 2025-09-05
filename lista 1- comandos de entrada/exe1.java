
import java.util.Scanner;

/*RECEBR UM NÚMERO, CALCULAR SEU DOBRO E EXIBIR O RESULTADO */

public class exe1{
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          int num;
          int num2 = 0;
          
          
          System.out.println("DIGITE UM NÚMERO");
          num = scn.nextInt();
          
          num2 = num * 2;
          System.out.println("O RESULTADO É " + num2);
          
     }
}