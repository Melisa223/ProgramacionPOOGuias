/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/

package Entidad2;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }

    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        this.radio = leer.nextInt();
        System.out.println("El radio que ingreso es: " + radio);
    }
    
    public double area(){
    double area = Math.pow((Math.PI * radio),2);
    return area;
    }
    
    public double perimetro(){
        double perimetro = (2 * Math.PI * radio);
        return perimetro;
    }
    
}

