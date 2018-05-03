/////este es el bueno..............
package tiendadeabarrotes;

import java.util.ArrayList;

/**
 *
 * @author Hannah
 */
public abstract class articulo extends Tiendadeabarrotes{
    //articulo clase padre 
    ArrayList Nombre;
    ArrayList Precio;
    ArrayList ID;
    
    //constructor

    public articulo(ArrayList Nombre, ArrayList Precio, ArrayList ID) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.ID = ID;
    }
    //getter y setter

    public ArrayList getNombre() {
        return Nombre;
    }

    public ArrayList getPrecio() {
        return Precio;
    }

    public ArrayList getID() {
        return ID;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(ArrayList Precio) {
        this.Precio = Precio;
    }

    public void setID(ArrayList ID) {
        this.ID = ID;
    }
    //metodos:
    public abstract void IngresarNombre (String nombres);
    public abstract void IngresarPrecio (int precio);
    public abstract void IngresarID (int ID);
    public abstract void EliminarNombre (String nombres);
    public abstract void EliminarPrecio (int precio);
    public abstract void EliminarID (int ID);
    public abstract String BuscarNombre (String nombres);
    public abstract int BuscarPrecio (int precio);
    public abstract int BuscarID (int ID);
    
}
