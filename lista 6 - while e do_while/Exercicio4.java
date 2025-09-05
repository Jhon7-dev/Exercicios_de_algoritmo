
import java.util.Scanner;

public class Exercicio4 {
     public static void main(String[] args) {
         Scanner scn = new  Scanner(System.in);

         int i = 0;
         int p  = 0;
         int c = 1;
         int cont = 1;
         int maior_numero = 0;
         int menor_numero = 0;
         int media_dos_numeros = 0;
         int soma = 0;
         char opcao ;
         System.out.println("QUANTOS NÚMEROS VOCÊ DESEJA DIGITAR?");
         p = scn.nextInt();
          
              do   {
               System.out.println("DIGITE O " + cont + " NÚMERO ");
               i = scn.nextInt();
               
               if(i == 1){
                    maior_numero=i;
                    menor_numero=i;

               }else{
                    if(i < menor_numero){

                         menor_numero = i;

                    }if(i>maior_numero){

                         maior_numero = i;
                    }
               }
               System.out.println("DESEJA CONTINUAR?");
               
               cont++;
               opcao = scn.next().charAt(0);
             }while (opcao == '1');
             do { 
                  opcao = scn.next().charAt(0);
             } while (opcao == '1');
         soma = i + soma;
         media_dos_numeros = soma/p;
         System.out.println("O MAIOR NÚMERO É " + maior_numero);
         System.out.println("A MÉDIA DOS NÚMEROS É " + media_dos_numeros);
     }
 }
 
