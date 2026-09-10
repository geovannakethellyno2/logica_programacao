/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicinal;

import java.util.Scanner;

/**
 *
 * @author GeovannaOliviera
 */
public class Exemplo3 {
 public static void main(String[] args) {
   
   int idadeP1 , idadeP2 , idadeP3;
   
   Scanner entrada= new Scanner(System.in);
   
     System.out.println("digite a idade da pessoa 1:");
     idadeP1 = entrada.nextInt();
     System.out.println("digite a idade da pessoa 2:");
     idadeP2 = entrada.nextInt();
     System.out.println("digite a idade da pessoa 3:");
     idadeP3 = entrada.nextInt();
     
     if(idadeP1>idadeP2 || idadeP1<idadeP3){
         System.out.println("pessoa 1 ganha um brinde");
     }if(idadeP2>idadeP3 && idadeP2>idadeP1){
         System.out.println("pessoa 2 ganha um brinde");
     }if(idadeP3<idadeP1 || idadeP3<idadeP2 && idadeP2>idadeP3){
     System.out.println("a pessoa 3 ganha um brinde");
     }
     
     
    }
   
}
