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
public class Amigos {
    int numero1, numero2;
    
    Amigos(int n1, int n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }   
    public boolean sonAmigos() {    
        if(calcularSumaDivisores(numero1) == numero2) {
            if(calcularSumaDivisores(numero2) == numero1) {
                return true;
            } 
            else {
                return false;
            }
        } 
        else {
            return false;
        }
    }
    
    public int calcularSumaDivisores(int n) {
        int suma=0;
        for (int i=1; i<n; i++) {
            if(n%i==0) {
                suma = suma + i;
            }
        }
        return suma;
    }
}
