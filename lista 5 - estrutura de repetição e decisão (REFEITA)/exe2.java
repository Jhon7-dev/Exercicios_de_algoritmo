
import java.util.Scanner;


/*RECEBER 10 NÚMEROS E, AO FINAL INFORMAR QUANTOS SÃO POSITIVOS E QUANTOS SÃO NEGATIVOS */
public class exe2 {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

         int num1 = 10;
         int num2;
         int positivo=0;
         int negativo=0;
         int cont = 1;

         while(cont<=num1){
          System.out.println("DIGITE " + cont + " NÚMERO ");
          num2 = scn.nextInt();
          cont++;
          if(num2>0){
               positivo++;
          }else if (num2<0){
               negativo++;
          }
     }
     System.out.println("AO TOTAL OS NÚMEROS POSITIVOS FORAM " + positivo);
     System.out.println("AO TOTAL OS NÚMEROS NEGATIVOS FORAM " + negativo);
   }
}
/*CORRETO! */