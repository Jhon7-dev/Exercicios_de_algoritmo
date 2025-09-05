
import java.util.Scanner;

/*SOLITAR QUANTOS NÚMEROS O USUÁRIO DESEJA INFORMAR, RECEBER CADA UM DELES E MOSTRAR A MÉDIA ARITMÉTICA NO FINAL */

public  class exe1{
     public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          int num1;
          int num2;
          int media;
          int cont = 1;
          int soma = 0;


          System.out.println("DIGITE QUANTOS NÚMEROS VOCÊ DESEJA INFORMAR");
          num1 = scn.nextInt();

          while(cont<=num1){
               System.out.println("DIGITE O " + cont + " NÚMERO ");
               num2 = scn.nextInt();
               cont++;
               soma = soma + num2;
          }
          media = soma / num1;
          System.out.println(" A MÉDIA FINAL DOS NÚMEROS É " + media);

     }
}

/* CORRETO!!! */