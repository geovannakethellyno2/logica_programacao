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
public class Questao9 {
    public static void main(String[] args) {
boolean matriculado;

Scanner  entradaTexto= new Scanner(System.in);

System.out.println("voce esta matriculado? digite true para sim ou false para nao");

   
matriculado= entradaTexto.nextBoolean();

System.out.println("aluno matriculado: "+matriculado);

 
    }
   
}
