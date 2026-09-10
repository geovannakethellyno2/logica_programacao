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
public class Desafio {
    public static void main(String[] args) {
    String nome , ingresso;    
    int idade;
    boolean Autorizacao = false;
    
    Scanner entrada = new Scanner(System.in);
    Scanner entradaLogica = new Scanner(System.in);
    
        System.out.println("digite seu nome:");
        nome= entrada.nextLine();
        
        System.out.println("digite sua idade:");
        idade= entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("digite seu tipo de ingresso");
        ingresso= entrada.nextLine();
        
        System.out.println("digite se possui autorizacao?"+"digite true para sim e false para nao:");
        Autorizacao= entradaLogica.nextBoolean();
        System.out.println("ola "+nome+" voce tem "+idade+" sua entrada foi liberada aproveite a festa!"); 
        
        if(idade>=18 && ingresso.equals("Vip")){
            System.out.println("Acesso Vip LIberado");    
        }else if(idade>=18 && ingresso.equals("comun")){
        System.out.println("Acesso Comum Liberado");
        }else if(idade==16 || idade==17 && Autorizacao== true){
            System.out.println("Acesso Liberado Com Autorizacao");
        }else if(ingresso.equals("Professor") && ingresso.equals("Funcionario")){
        System.out.println("Acesso Especial Librado");
        }else{           
            System.out.println("Acesso Negado!");           
                
                 
        
        }
    }
}
   
  
