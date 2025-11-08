/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercicio5.teste;
import br.edu.etec.Exercicio5.model.InstrumentoMusical;
import br.edu.etec.Exercicio5.model.Guitarra;
import br.edu.etec.Exercicio5.model.Piano;

public class Teste {
    public static void main(String[] args) {
        InstrumentoMusical guitarra = new Guitarra();
        System.out.println("====GUITARRA====");
        guitarra.tocar();
        
        InstrumentoMusical piano = new Piano();
        System.out.println("====PIANO====");
        piano.tocar();       
    }
   }