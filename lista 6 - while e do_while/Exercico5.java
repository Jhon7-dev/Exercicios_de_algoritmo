
import java.util.Scanner;


/*CALCULADORA */

public class Exercico5 {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
           double a,b;
           double  resultado;
          char  operacao, continuar;
          int cont = 0;
          
          do { 
          System.out.println("\n ESCOLHA UMA OPERAÇÃO");
          System.out.println(" A - ADIÇÃO");
          System.out.println(" B - SUBTRAÇÃO");
          System.out.println(" C - MULTIPLICAÇÃO");
          System.out.println(" D - DIVISÃO");
          operacao = scn.next().charAt(0);

        
               System.out.println(" DIGITE O PRIMEIRO  NÚMERO ");
               a = scn.nextDouble();
               System.out.println("DIGITE O  SEGUNDO  NÚMERO ");
               b = scn.nextDouble();
                
             switch(operacao){
               case 'A':
                resultado = a + b;
                System.out.println("RESULTADO DA SOMA É " + resultado);
                break;
               case 'B'  :
               resultado = a - b;
               System.out.println("RESULTADO DA SUBTRAÇÃO É " + resultado);
               break;
               case 'C':
               resultado = a*b;
               System.out.println("RESULTADO DA MULTIPLICAÇÃO É " + resultado);
               break;
               case 'D' :
               resultado = a/b;
               break;
               default:
               System.out.println("OPÇÃO INVÁLIDA");
               break;
             }
              System.out.println("DESEJA CONTINUAR?");
              continuar = scn.next().charAt(0);
          } while (continuar == 'S'|| continuar == 's');
          System.out.println("PROGRAMA ENCERRADO!");

}
     
}
