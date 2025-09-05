
/*CALCULAR E EXIBIR O CONSUMO MÉDIO DE UM COMBUSTIVEL RECEBENDO A DISTANCIA PERCORRIDA E A QUANTIDADE DE COMBUSTÍVEL GASTO. CONSUMO MÉIDO = DISTÂNCIA PERCORRIDA (KM)/COMBUS´TIVEL GASTO(L)
 */

import java.util.Scanner;

public class exe9 {
     public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
      double km;
      double combustivel_gasto;
      double consumo_medio;

      System.out.println("DIGITE A DISTÂNCIA PERCORRIDA EM (KM): ");
      km = scn.nextDouble();
      System.out.println("O COMBUSTÍVEL QUE FOI GASTO EM (L)");
      combustivel_gasto = scn.nextDouble();

      consumo_medio = km/combustivel_gasto;
      System.out.println("O CONSUMO MÉDIO FOI DE " + consumo_medio + " KM/L");
     }
     
}
