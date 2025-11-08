/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercicio4.model;

    public class Gerente extends Funcionario{
    
    double salario;
    double multiplicadorVendas; 
        
    @Override
    public double calcularSalario() {
        return salario*multiplicadorVendas;
        }
    
    public Gerente (double salario, double multiplicadorVendas) {
        this.salario = salario;
        this.multiplicadorVendas = multiplicadorVendas;
    }    
    }
    
