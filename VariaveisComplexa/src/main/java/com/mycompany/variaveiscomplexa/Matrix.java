/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveiscomplexa;

import java.util.Scanner;

/**
 *
 * @author GeovannaOliviera
 */
public class Matrix {
public static void main(String[] args) {

Scanner entrada= new Scanner(System.in);
int linhas=0;
int colunas=0;
    String [][] alunos= new String[11][2];
    
    alunos[0][0]="Jordana";
    alunos[1][0]="Geovanna";        
    alunos[2][0]="Kauwan";        
    alunos[3][0]="Kaleb";        
    alunos[4][0]="Arthur M.";        
    alunos[5][0]="Antonio";        
    alunos[6][0]="Enzo";        
    alunos[9][0]="Pedro";         
    
    alunos[0][1]="Rogerio"; 
    alunos[1][1]="Israel";        
    alunos[2][1]="Arthur B.";        
    alunos[3][1]="Cleiciane";
    alunos[4][1]="Samara";
    alunos[5][1]="Maria";
    alunos[6][1]="Victor";        
    alunos[9][1]="Daniel";        
    alunos[10][1]="Raniely";        
     
    
    
    System.out.println("digite o numero entre 0 e 10, para escolher a linha"); 
    linhas= entrada.nextInt();
    
    System.out.println("digite o numero entre 0 e , para escolher a coluna");
    colunas= entrada.nextInt();
    
    System.out.println("o aluno escolhido foi "+alunos[linhas][colunas]);
    
  }
}