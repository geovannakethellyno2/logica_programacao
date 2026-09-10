/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;
import java.util.Scanner;
/**
 *
 * @author GeovannaOliviera
 */
public class Questao5 {
public static void main(String[] args) {
int idade;
boolean maiorDeIdade;

Scanner entradaNumero= new Scanner(System.in);

 System.out.println("digite sua idade");
 
 idade= entradaNumero.nextInt();
 
 maiorDeIdade= idade>=18;
 
 System.out.println("maior de idade:"+maiorDeIdade);

    
        
    }
    
}
