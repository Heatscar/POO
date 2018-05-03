/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadeabarrotes;

import java.util.ArrayList;

/**
 *
 * @author Hannah
 */
public class Abarrotes extends articulo {

    public Abarrotes(ArrayList Nombre, ArrayList Precio, ArrayList ID) {
        super(Nombre, Precio, ID);
    }

    @Override
    public void IngresarNombre(String nombres) {
        super.Nombre.add(nombres);
    }
        

    @Override
    public void IngresarPrecio(int precio) {
        super.Precio.add(precio);
    }

    @Override
    public void IngresarID(int ID) {
        super.ID.add(ID);
    }
    //indexOf obtienela ubicacion del elemento 
    @Override
    public void EliminarNombre(String nombres) {
        super.Nombre.remove(super.Nombre.indexOf(nombres));
    }

    @Override
    public void EliminarPrecio(int precio) {
        super.Precio.remove(super.Precio.indexOf(precio));
    }

    @Override
    public void EliminarID(int ID) {
       super.ID.remove(super.ID.indexOf(ID));
    }

    @Override
    public String BuscarNombre(String nombres) {
        //declarar una variable primero
        String buscarnombre = "";
        if (super.Nombre.contains(nombres)==true){
            buscarnombre = super.Nombre.get(super.Nombre.indexOf(nombres)).toString();
        }else{
            buscarnombre = "No existe un articulo con esa descripcion";
        }
        return buscarnombre;
    }
    

    @Override
    public int BuscarPrecio(int precio) {
        int buscarprecio = 0;
        if (super.Precio.contains(precio)==true){
            buscarprecio = Integer.parseInt(super.Precio.get(super.Precio.indexOf(precio)).toString());
        }else{
            buscarprecio = 0;
        }
        return buscarprecio;
    }

    @Override
    public int BuscarID(int ID) {
    int buscarID = 0;
        if (super.ID.contains(ID)==true){
            buscarID = Integer.parseInt(super.ID.get(super.ID.indexOf(ID)).toString());
        }else{
            buscarID = 0;
        }
        return buscarID;
    }
}