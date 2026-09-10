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
public class Questao7 {
public static void main(String[] args) {
 
String nome;

Scanner entradaTexto= new Scanner(System.in);
Scanner entradaNumero= new Scanner(System.in);
Scanner entradaLogica= new Scanner(System.in);

System.out.println("digite seu nome.");

nome= entradaTexto.nextLine();

System.out.println("digite sua idade.");

 int idade = entradaNumero.nextInt();
 
System.out.println("digite sua altura.");

Float altura = entradaNumero.nextFloat();

System.out.println("ola,"+nome+" Seja Bem-Vindo(a),voce tem "+idade+" anos e a sua altura e "+altura);

    }
    
}
