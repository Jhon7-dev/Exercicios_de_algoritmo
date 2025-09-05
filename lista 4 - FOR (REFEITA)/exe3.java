
import java.util.Scanner;

/*RECEBER 10 NÚMEROS E INFORMAR SE CADA UM DELES É NEGATIVO, POSITIVO OU NULO. */
public class exe3 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);
          int num;
          
      
          for(int p = 1; p<=5;p++){
               System.out.println("DIGITE O " + p + " NÚMERO");
               num = scn.nextInt();
               if (num >= 1){
                    System.out.println("POSITIVO!");
               }else if(num == 0){
                    System.out.println("nulo");      
               }else{
                    System.out.println("negativo");
               }
          }
     }
}
/*FEITO!!! */