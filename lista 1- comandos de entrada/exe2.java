
import java.util.Scanner;

/*RECEBER DOIS VALORES, CALUCLAR A SUA MEDIA ARTIMETICA E EXIBIR O RESULTADO */

public class exe2 {
     public static void main(String[] args) {
          
          Scanner scn = new Scanner(System.in);

          int num1;
          int num2;
          int media;
          int soma;

          System.out.println("DIGITE O PRIMEIRO VALOR: ");
          num1 = scn.nextInt();
          System.out.println("DIGITE O SEGUNDO VALOR: ");
          num2 = scn.nextInt();
          media = (num1+num2)/2;
          System.out.println("A MÉDIA DOS VALORES É :" + media);
          




     }
}
