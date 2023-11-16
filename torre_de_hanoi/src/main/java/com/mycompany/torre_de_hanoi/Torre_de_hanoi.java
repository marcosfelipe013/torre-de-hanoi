/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torre_de_hanoi;

/**
 *
 * @author marco
 */
public class TorreDeHanoi {
    public static void main(String[] args) {
        long numeroDeDiscos = Long.parseLong(args[0]);
        long tempo = calcularTempo(numeroDeDiscos);
        System.out.println("Tempo necessário: " + tempo);
    }

    public static long calcularTempo(long numeroDeDiscos) {
        if (numeroDeDiscos == 1L) {
            return 1L;
        } else {
            return 2 * calcularTempo(numeroDeDiscos - 1) + 1L;
        }
    }
}