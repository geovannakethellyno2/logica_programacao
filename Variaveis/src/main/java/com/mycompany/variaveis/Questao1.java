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
public class Questao1 {
    

            
            
    public static void main(String[] args) {
     //variavel
     String nome;
     //criar entrada
     Scanner entradaTexto= new Scanner (System.in);
     //solicitar queo usuario digite seu nome
     
     System.out.println("digite o seu nome");
    nome=entradaTexto.nextLine();
               
    //imprimir a mensagem

    System.out.println("ola," +nome+ "! Seja Bem-Vindo(a) ao Java.");
 
    }
}
