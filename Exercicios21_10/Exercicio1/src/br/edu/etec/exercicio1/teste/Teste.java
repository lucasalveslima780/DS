/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.teste;

import br.edu.etec.exercicio1.model.Animal;
import br.edu.etec.exercicio1.model.Cachorro;
import br.edu.etec.exercicio1.model.Gato;

public class Teste {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        System.out.println("E o cachorro entao latiu: ");
        cachorro.fazerSom();
        
        Animal gato = new Gato();
        System.out.println("Ja o gato miou: ");
        gato.fazerSom();
    }
}
