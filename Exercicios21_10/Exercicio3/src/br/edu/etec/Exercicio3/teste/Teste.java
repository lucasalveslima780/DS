/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercicio3.teste;

import br.edu.etec.Exercicio3.model.Bicicleta;
import br.edu.etec.Exercicio3.model.Carro;
import br.edu.etec.Exercicio3.model.Veiculo;

public class Teste {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        System.out.println("=== Carro ===");
        carro.mover();
        
        Veiculo bicicleta = new Bicicleta();
        System.out.println("=== Bicicleta ===");
        bicicleta.mover();
    }
}
