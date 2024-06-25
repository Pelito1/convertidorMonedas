/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.apirest.challenge_conversor;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author RicardoV
 */
public class Challenge_Conversor {

    public static void limpiarPantalla() {
        System.out.println("\n\n\n\n\n\n\n\n");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int opcionMenu = 0;

        while (opcionMenu != 7) {
            System.out.println("\t\"CONVERSOR DE MONEDAS INTERNACIONALES A DOLARES\"");
            System.out.print(" \n1.Dolar -->Peso argentino"
                    + "\n2.Peso argentino -->Dolar"
                    + "\n3.Dolar -->Real brasileno"
                    + "\n4.Real brasileno -->Dolar"
                    + "\n5.Dolar -->Peso colombiano"
                    + "\n6.Peso colombiano -->Dolar"
                    + "\n7.Salir\n");

            System.out.println("Ingrese un numero de opcion");
            opcionMenu = entrada.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Ingrese el monton de dolares a convertir a peso argentino");
                    ConexionAPI.conexion("USD", "ARS", entrada.nextDouble());
                    Challenge_Conversor.limpiarPantalla();
                    break;
                case 2:
                    System.out.println("Ingrese el monton de peso argentino a convertir a dolares");
                    ConexionAPI.conexion("ARS", "USD", entrada.nextDouble());
                    Challenge_Conversor.limpiarPantalla();
                    break;
                case 3:
                    System.out.println("Ingrese el monton de dolares a convertir a reales brasilenos");
                    ConexionAPI.conexion("USD", "BRL", entrada.nextDouble());
                    Challenge_Conversor.limpiarPantalla();
                    break;
                case 4:
                    System.out.println("Ingrese el monton de reales brasilenos a convertir a dolares");
                    ConexionAPI.conexion("BRL", "USD", entrada.nextDouble());
                    Challenge_Conversor.limpiarPantalla();
                    break;
                case 5:
                    System.out.println("Ingrese el monton de dolares a convertir a pesos colombiano");
                    ConexionAPI.conexion("USD", "COP", entrada.nextDouble());
                    Challenge_Conversor.limpiarPantalla();
                    break;
                case 6:
                    System.out.println("Ingrese el monton de pesos colombiano a convertir a dolares");
                    ConexionAPI.conexion("COP", "USD", entrada.nextDouble());
                    Challenge_Conversor.limpiarPantalla();
                    break;
                case 7:
                    Challenge_Conversor.limpiarPantalla();
                    break;
                default:
                    System.out.println("El numero ingresado no es valido");
                    break;
            }

        }

    }
}
