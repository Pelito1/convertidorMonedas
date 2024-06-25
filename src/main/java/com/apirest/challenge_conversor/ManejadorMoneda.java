/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apirest.challenge_conversor;

/**
 *
 * @author RicardoV
 */
public class ManejadorMoneda {
   double factorConversion;

    public ManejadorMoneda(double factorConversion) {
        this.factorConversion = factorConversion;
    }
   
   double valorConversionFinal(double montoConvertible){
   return factorConversion * montoConvertible;
   }
}
