/*
Tiene que llevar todo lo que hemos visto en clase:
Herencia, polimorfismo, lista de arreglos, clases abstractas, encapsulamiento, interfaces, sobrecarga de metodos, manejo de excepciones
y archivos de txt
 */
package finalpoo;

/**
 *
 * @author Hannah
 */
public class Finalpoo  {
    
    String nombre;
    String precio;
    String cantidad;
    String detalles;

    public Finalpoo(String nombre, String precio, String cantidad, String detalles) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.detalles = detalles;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
