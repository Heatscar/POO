/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearfichero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author hecto
 */
public class CrearFichero {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        Scanner scanf = new Scanner(System.in);
        
        String ruta = "C:\\Otras cosas\\Universidad\\Cuarto semestre\\Ficheros java/archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        System.out.println("Ingrese la cadena nueva: ");
        String cadena = scanf.nextLine(); 
        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write(" " + cadena);
        
        bw.close();   
    } 
}
