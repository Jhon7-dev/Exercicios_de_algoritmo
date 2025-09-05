
import java.util.Scanner;

/*CALCULAR A AREA DA DO TRIÂNGULO */

public class exe6 {
     public static void main(String[] args) {
          
          Scanner scn = new Scanner(System.in);

          int base;
          int altura;
          int area;

          System.out.println("DIGITE A BASE DO TRIÂNGULO ");
          base = scn.nextInt();
          System.out.println("DIGITE A ALTURA DO TRIÂNGULO");
          altura = scn.nextInt();

          area = (base*altura)/2;
          System.out.println("A ÁREA DO TRIÂNGULO É " + area + " M2 ");
     }
}
