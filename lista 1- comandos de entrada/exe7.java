
import java.util.Scanner;


/*calcular de fahrenheit para celcius */
public class exe7 {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

         double f;
         double c;

          System.out.println("DIGITE A TEMPERATURA EM FAHRENHEIT ");
          f = scn.nextDouble();
          c = (f - 32) / 1.8;
          System.out.println("A TEMPERATURA EM CELSIUS É " + c);


     }
}
