/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

/**
 *
 * @author heatscar
 */
public class Perfectos {
        public static boolean Perfecto(int n){
        int i;
        int suma=0;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                suma = suma + i;
            }
        }
        return suma == n;
    }
}
