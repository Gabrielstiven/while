
package com.mycompany.aula07_03_24;

import java.util.Scanner;

public class Aula07_03_24 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipo = 0;
        
        int x;
        int soma;
        
        
        /*while (x != 0){
        soma += x;
        x = teclado.nextInt();
        }
        teclado.close();
        System.out.println("a soma de todos os numeros é =" + soma);
        */ 
        /*while(x != 10){
        x = teclado.nextInt();
         
        while (x != 2002){
        System.out.println("senha inválida");
        x = teclado.nextInt();
        }       System.out.println("senha válida");
        */ 
        
        System.out.println("digite um numero equivalente ao combustivel");
        tipo = teclado.nextInt();
       while (tipo != 4){
            switch (tipo) {
                case 1:
                    alcool += 1;
                    System.out.println("alcool adicionado");
                    break;
                case 2:
                    System.out.println("gasolina adicionada");
                    gasolina += 1;
                    break;
                case 3:
                    System.out.println("diesel adicionado");
                    diesel += 1;
                    break;
                default:
                    break;
            }
           tipo =teclado.nextInt();
    } 
    
    System.out.printf("MUITO OBRIGADO : \n foi adicionando \n alcool: %d \n gasolina :%d \n diesel :%d \n",alcool,gasolina,diesel);
    }
    {
    Scanner teclado4 = new Scanner (System.in);
    
        int nm1 = teclado4.nextInt();
        System.out.println("tabuada do:");
        while (nm1 != 0){

            System.out.println(" \n tabuada do ");
            System.out.printf(" %d x 1 = %d \n ", nm1, nm1 * 1);
            System.out.printf("%d x 2 = %d \n ", nm1, nm1 * 2);
            System.out.printf("%d x 3 = %d \n ", nm1, nm1 * 3);
            System.out.printf("%d x 4 = %d \n ", nm1, nm1 * 4);
            System.out.printf("%d x 5 = %d \n ", nm1, nm1 * 5);
            System.out.printf("%d x 6 = %d \n ", nm1, nm1 * 6);
            System.out.printf("%d x 7 = %d \n ", nm1, nm1 * 7);
            System.out.printf("%d x 8 = %d \n ", nm1, nm1 * 8);
            System.out.printf("%d x 9 = %d \n ", nm1, nm1 * 9);
            System.out.printf("%d x 10 = %d \n ", nm1, nm1 * 10);
            break;
 
}}}

    
    
          
           

               
           
                        
               
            

    
           
           
        
    
           
    

