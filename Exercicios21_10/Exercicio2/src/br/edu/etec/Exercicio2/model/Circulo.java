/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercicio2.model;

    public class Circulo extends Forma{

    public Circulo(double raio) {
        this.raio = raio;
    }
  
    double raio;
            
    @Override
    public double calcularArea() {
        return Math.PI*raio*raio;
    }
    }
