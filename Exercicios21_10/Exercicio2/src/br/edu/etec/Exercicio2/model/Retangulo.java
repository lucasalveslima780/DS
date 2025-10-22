/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercicio2.model;

    public class Retangulo extends Forma{

    double base;
    double altura;
        
    @Override
    public double calcularArea() {
        return base*altura;
    }
        
        
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    }
