
/*RECEBER UM COMPRIMENTO EM METROS,CONVERTÊ-LO PARA CENTÍMETROS E MOSTRAR O RESULTADO */

import java.util.Scanner;

public class exe3 {
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);


          int metros;
          int cm;

          System.out.println("DIGITE O VALOR EM METROS");
          metros = scn.nextInt();
          
          cm = metros*100;
          System.out.println("O VALOR EM CENTIMETROS É : " + cm + " CENTIMETROS");

     }
}
