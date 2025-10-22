/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercicio2.teste;

import br.edu.etec.Exercicio2.model.Forma;
import br.edu.etec.Exercicio2.model.Circulo;
import br.edu.etec.Exercicio2.model.Retangulo;

public class Teste {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(6,5);
        
   
         circulo.calcularArea();
        retangulo.calcularArea();
    }
   }
