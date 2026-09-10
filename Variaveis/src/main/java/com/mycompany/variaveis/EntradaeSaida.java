/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author GeovannaOliviera
 */
// importando as bibliotecas do Scanner
    import java.util.Scanner;

public class EntradaeSaida {
    
    public static void main(String[] args) {
    // código para cadastrar o pet
    // váriaveis declaradas sem dados   
    String nome;
    String raca;
    int idade;
    double peso;
    boolean foiVacinado;
    // criando as váriaveis de captura de dados   
    Scanner entradaTexto = new Scanner (System.in);
    Scanner entradaNumero= new Scanner (System.in);  
    Scanner entradaLogica= new Scanner (System.in);
    
    System.out.println("digite o nome do seu pet:");
    nome= entradaTexto.nextLine();
    
        System.out.println("digite a raca do seu pet:");
    raca = entradaTexto.nextLine();
    
     System.out.println("digite a idade do seu pet:");
     idade= entradaNumero.nextInt();
     
     System.out.println("digite o peso do seu pet:");
     peso= entradaNumero.nextDouble();
    
        System.out.println("seu pet e vacinado?");
        System.out.println("digite true para sim,"+"ou false para nao");
        foiVacinado= entradaLogica.hasNext();
     
        System.out.println("Bem-Vindo (a) "+nome);
        System.out.println("Voce e da raca " +raca+ " e tem "+idade+" anos");
        System.out.println("Seu dono informou que seu peso e "+peso+" kg");
        System.out.println("E que seu status de vacina e "+foiVacinado);
        
        
    
    }//fim da main
    
}//fim da classe EntradaeSaida
