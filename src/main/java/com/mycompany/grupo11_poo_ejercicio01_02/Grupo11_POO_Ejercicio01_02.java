/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.grupo11_poo_ejercicio01_02;

/**
 *
 * @author Kristina
 */
public class Grupo11_POO_Ejercicio01_02 {

    public static void main(String[] args) {

        var lim1 = 100.0d;
        var lim2 = 300.0d;
        var lim3 = 500.0d;

        var empleado1 = new Empleado();
        empleado1.nombre = "Juan";
        empleado1.costoHora = 1.77;
        empleado1.horasTrabajadas = 160;
        empleado1.yearIngreso = 2019;

        System.out.println("\nEl empleado llamado " + empleado1.nombre
                + " ingreso el año " + empleado1.yearIngreso + " gana por hora "
                + empleado1.costoHora + " y ha trabajado " + empleado1.horasTrabajadas + "");
        System.out.println("El empleado gana $" + empleado1.calcularIngreso(2022));
        System.out.println("El empleado tiene un bono $" + empleado1.bonosHorasExtra());
        System.out.println("Los impuestos son $" + empleado1.calculaImpuesto(lim1, lim2, lim3));
        System.out.println("El total es de $" + empleado1.calcularTotal());

        var empleado2 = new Empleado();
        empleado2.nombre = "Alberto";
        empleado2.costoHora = 1.77;
        empleado2.horasTrabajadas = 180;
        empleado2.yearIngreso = 2019;
        System.out.println("\nEl empleado llamado " + empleado2.nombre
                + " ingreso el año " + empleado2.yearIngreso + " gana por hora "
                + empleado2.costoHora + " ha trabajado " + empleado2.horasTrabajadas + "");
        System.out.println("El empleado gana $" + empleado2.calcularIngreso(2022));
        System.out.println("El empleado tiene un bono $" + empleado2.bonosHorasExtra());
        System.out.println("Los impuestas son $" + empleado2.calculaImpuesto(lim1, lim2, lim3));
        System.out.println(" El total es de $" + empleado2.calcularTotal());
        
         var empleado3 = new Empleado();
        empleado3.nombre = "Cesar";
        empleado3.costoHora = 2.00;
        empleado3.horasTrabajadas = 300;
        empleado3.yearIngreso = 2021;

        System.out.println("\nEl empleado llamado " + empleado3.nombre
                + " ingreso el año " + empleado3.yearIngreso + " gana por hora "
                + empleado1.costoHora + " y ha trabajado " + empleado3.horasTrabajadas + "");
        System.out.println("El empleado gana $" + empleado3.calcularIngreso(2022));
        System.out.println("El empleado tiene un bono $" + empleado3.bonosHorasExtra());
        System.out.println("Los impuestos son $" + empleado3.calculaImpuesto(lim1, lim2, lim3));
        System.out.println("El total es de $" + empleado3.calcularTotal());

    }
}
