
import java.util.Scanner;


/* RECEBER UM NÚMERO E MOSTRAR SUA TABUADA DO 1 AO 10*/
public class exe2 {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

          
          
         int num;

         System.out.println("TABUADA");
         System.out.println(" QUAL TABUADA VOCÊ DESEJA MOSTRAR? \n");
         num = scn.nextInt();

         for(int i = 0;i<=10;i++){
          System.out.println(num +" X " + i + " = " + i*num );
         }

     }
}
