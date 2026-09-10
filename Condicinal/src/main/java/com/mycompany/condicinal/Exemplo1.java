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
public class Exemplo1 {
public static void main(String[] args) {
 double altura, peso, imc;
 
 String nome;
 Scanner entrada= new Scanner(System.in);
 
    System.out.println("digte o seu nome:");
    nome = entrada.nextLine();
    
    System.out.println("digite sua altura:");
    altura= entrada.nextDouble();
    
    System.out.println("digite seu peso:");
    peso= entrada.nextDouble();
    
    // CALCULAR O IMC (IF ANINHADO)
    
    imc = peso / (altura*altura);
     
    if(imc<=16.9){
    System.out.println("muito abaixo do peso");
    }if(imc>=17 && imc<=18.4){
     System.out.println("abaixo do peso");
    }if(imc>=18.5 && imc<=24.9){
    System.out.println("peso normal");    
    }if(imc>=25 && imc<=29.9){
    System.out.println("acima do peso!");
    }if(imc>=30 && imc<=34.9){
    System.out.println("obesidade grau I");   
    }if(imc>=35 && imc<=40){
    System.out.println("obesidade grau II");        
   }if(imc>=40 && imc<=49.9){
     System.out.println("obesidade grau III");  
    }
    System.out.println("ola "+nome+" sua altura e "+altura+" e seu peso e "+peso);
      }

          }

