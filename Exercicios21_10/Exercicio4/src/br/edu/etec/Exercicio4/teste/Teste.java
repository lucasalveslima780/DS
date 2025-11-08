/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercicio4.teste;

import br.edu.etec.Exercicio4.model.Funcionario;
import br.edu.etec.Exercicio4.model.Gerente;
import br.edu.etec.Exercicio4.model.Vendedor;

public class Teste {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente(5000,2.5);
        System.out.println("====SALARIO GERENTE====");
        System.out.println("O seu salario e: " + gerente.calcularSalario() );
        
        Funcionario vendedor = new Vendedor(2000,1.5);
        System.out.println("====SALARIO FUNCIONARIO====");
        System.out.println("O seu salario e: " + vendedor.calcularSalario() );
        
        gerente.calcularSalario();
        vendedor.calcularSalario();
    }
}
