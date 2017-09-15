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
public class Primos {
    public static boolean det(int a){
    boolean bool = true;
    int n = 1, m = 0;
    while(n<=a){ m = a % n;
    if(m==0){
        if(n!=1 && n!=a){ 
            bool = false; 
           }
        }
        n++;
    }
    return bool;
  }    
}
