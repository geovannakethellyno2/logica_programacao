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
public class Exemplo2 {
    public static void main(String[] args) {
  
        int quantidadeMiojo, quantidadeSalada;    
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("A quantos dias voce nao come miojo?");
        quantidadeMiojo= entrada.nextInt();
        
        System.out.println("A quantos dias voce nao come salada?");
        quantidadeSalada= entrada.nextInt();
       
        if(quantidadeMiojo<2 || quantidadeSalada>7){
            System.out.println("pouco saudave!!");   
        }
        if(quantidadeMiojo>=2 || quantidadeSalada<7){
            System.out.println("saudavel!!");
                   
        }
    }
    
}
