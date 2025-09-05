
import java.util.Scanner;

/*RECEBER O ANO DE NASCIMENTO DE UMA PESSOA E MOSTRAR APROXIMADAMENTE QUANTOS DIAS DE VIDA ELA TEM */

public class exe4 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int idade;
          int dia;
          
          System.out.println("OLÁ DIGITE A SUA IDADE:");
          idade = scn.nextInt();

          dia = idade*365;
          System.out.println(" VOCÊ VIVEU APROXIMADAMENTE " + dia + " DE VIDA ");
          

     }
     
}
