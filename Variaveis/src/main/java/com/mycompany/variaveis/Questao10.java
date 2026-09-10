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
public class Questao10 {
public static void main(String[] args) {

 String nome;
 int idade;
 double salario;
 boolean carteiraAssinada;
  Scanner entrada= new Scanner (System.in);
    System.out.println("digite o nome do funcionario");
    nome = entrada.nextLine();
    
    System.out.println("digite sua idade");
    idade= entrada.nextInt();
    
    System.out.println("digite seu salario");
    salario= entrada.nextDouble();
    
    System.out.println("possui carteira assinada? Digite true ou false:");
    carteiraAssinada= entrada.nextBoolean();
    
    System.out.println("---CADASTRO DE FUNCIONARIO---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Carteira assinada: " + carteiraAssinada);
    

    }
   
}
