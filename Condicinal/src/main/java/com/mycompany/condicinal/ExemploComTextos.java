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
public class ExemploComTextos {
public static void main(String[] args) {
 
  //DESAFIO BARRADO DA FESTA

   String nome;
   
    Scanner entrada= new Scanner(System.in);
    
    System.out.println("ola,me diga seu nome para eu ver se esta na lista:");
    nome= entrada.nextLine();
    
    // PARA AVALIAR IGUALDADE USAMOS A FUNCAO EQUALS
    if(nome.equals("Enzo")){
    System.out.println("desculpe,seu nome nao esta na lista");   
    }else if(nome.equals("Antonio")){
    System.out.println("saia ja daqui seu penetra!!");
    }else if(nome.equals("Jordana")){
    System.out.println("Bem Vinda Chefona!");      
    }else if(!nome.equals("Enzo") && !nome.equals("Antonio") && !nome.equals("Jordana") && !nome.equals("Maria")){
    System.out.println("Seja Bem vindo!");        
    }
    
        }
  
    }
