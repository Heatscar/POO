package sample;
import java.net.URL;

import java.util.ResourceBundle;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.text.ParseException;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
public class MenuController implements Initializable {
    @FXML private TableView<Prestamo> tabla_prestamos;
    @FXML private Button _crear;
    @FXML private Button _editar;
    @FXML private Button _eliminar;
    private ObservableList<Prestamo> tabla_prestamos_valores;
    @Override
    public void initialize(URL location, ResourceBundle resources){
        Files archivo_prestamos = new Files("prestamos.txt");
        String []prestamos = archivo_prestamos.read().split("\n");
        String []prestamo;
        for (int i = 0; i < prestamos.length; i++){
            prestamo = prestamos[i].split(",");
            if(prestamo.length != 11) continue;
            ObservableList<Prestamo> valores = this.tabla_prestamos.getItems();
            valores.add(
                new Prestamo(
                    // Libro
                    prestamo[0], // id
                    prestamo[1], // titulo
                    prestamo[2], // autor
                    prestamo[3], // editorial
                    prestamo[4], // edicion
                    
                    // Prestamo
                    prestamo[5],  // nombre
                    prestamo[6],  // direccion
                    prestamo[7],  // telefono
                    prestamo[8],  // fecha_inicial
                    prestamo[9], // fecha_final
                    prestamo[10]  // fecha_entrega
                )
            );
        }
        this.tabla_prestamos_valores = this.tabla_prestamos.getItems();
    }
	public void crear()
    {
        Window window = new Window();
        window.open("crear.fxml", "Crear");
        window.close(this._crear.getScene());
    }
    public void editar()
    {
        String id = tabla_prestamos.getSelectionModel().getSelectedItem().getId();
        System.out.println(id);
        String titulo = tabla_prestamos.getSelectionModel().getSelectedItem().getTitulo();
        String autor = tabla_prestamos.getSelectionModel().getSelectedItem().getAutor();
        String editorial = tabla_prestamos.getSelectionModel().getSelectedItem().getEditorial();
        String edicion = tabla_prestamos.getSelectionModel().getSelectedItem().getEdicion();
        String nombre = tabla_prestamos.getSelectionModel().getSelectedItem().getNombre();
        String direccion = tabla_prestamos.getSelectionModel().getSelectedItem().getDireccion();
        String telefono = tabla_prestamos.getSelectionModel().getSelectedItem().getTelefono();
        String fecha_inicial = tabla_prestamos.getSelectionModel().getSelectedItem().getFecha_inicial();
        String fecha_final = tabla_prestamos.getSelectionModel().getSelectedItem().getFecha_final();
        String fecha_entrega = tabla_prestamos.getSelectionModel().getSelectedItem().getFecha_entrega();

        EditarController controller = new EditarController(id, titulo, autor, editorial, edicion, nombre, direccion, telefono, fecha_inicial, fecha_final, fecha_entrega);
        Window window = new Window();
        window.open("editar.fxml", "Editar", controller);
        window.close(this._editar.getScene());
    }
    public void eliminar()
    {
        String id = tabla_prestamos.getSelectionModel().getSelectedItem().getId();
        System.out.println(id);
        String titulo = tabla_prestamos.getSelectionModel().getSelectedItem().getTitulo();
        String autor = tabla_prestamos.getSelectionModel().getSelectedItem().getAutor();
        String editorial = tabla_prestamos.getSelectionModel().getSelectedItem().getEditorial();
        String edicion = tabla_prestamos.getSelectionModel().getSelectedItem().getEdicion();
        String nombre = tabla_prestamos.getSelectionModel().getSelectedItem().getNombre();
        String direccion = tabla_prestamos.getSelectionModel().getSelectedItem().getDireccion();
        String telefono = tabla_prestamos.getSelectionModel().getSelectedItem().getTelefono();
        String fecha_inicial = tabla_prestamos.getSelectionModel().getSelectedItem().getFecha_inicial();
        String fecha_final = tabla_prestamos.getSelectionModel().getSelectedItem().getFecha_final();
        String fecha_entrega = tabla_prestamos.getSelectionModel().getSelectedItem().getFecha_entrega();

        EliminarController controller = new EliminarController(id, titulo, autor, editorial, edicion, nombre, direccion, telefono, fecha_inicial, fecha_final, fecha_entrega);
        Window window = new Window();
        window.open("eliminar.fxml", "Eliminar", controller);
        window.close(this._eliminar.getScene());
    }
    public void entregar()
    {
        String id = tabla_prestamos.getSelectionModel().getSelectedItem().getId();
        System.out.println(id);
        String titulo = tabla_prestamos.getSelectionModel().getSelectedItem().getTitulo();
        String autor = tabla_prestamos.getSelectionModel().getSelectedItem().getAutor();
        String editorial = tabla_prestamos.getSelectionModel().getSelectedItem().getEditorial();
        String edicion = tabla_prestamos.getSelectionModel().getSelectedItem().getEdicion();
        String nombre = tabla_prestamos.getSelectionModel().getSelectedItem().getNombre();
        String direccion = tabla_prestamos.getSelectionModel().getSelectedItem().getDireccion();
        String telefono = tabla_prestamos.getSelectionModel().getSelectedItem().getTelefono();
        String fecha_inicial = tabla_prestamos.getSelectionModel().getSelectedItem().getFecha_inicial();
        String fecha_final = tabla_prestamos.getSelectionModel().getSelectedItem().getFecha_final();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        Date hoy = new Date();
        String fecha_entrega = sdf.format(hoy);



        Files archivo_prestamos = new Files("prestamos.txt");
        String []prestamos = archivo_prestamos.read().split("\n");

        int indice_prestamo = 0;

        for (int i = 0; i < prestamos.length; ++i) 
        {
            if(prestamos[i].split(",")[0].equals(id))
            { 
                indice_prestamo = i; 
                break;  
            }
        }
        
        prestamos[indice_prestamo] = id + "," + titulo + "," + 
        autor + "," + editorial + "," + edicion + "," +
        nombre + "," + direccion + "," + telefono + "," +
        fecha_inicial + "," + fecha_final + "," + fecha_entrega;
        
        archivo_prestamos.override(String.join("\n", prestamos));

        tabla_prestamos.getSelectionModel().getSelectedItem().setFecha_entrega(fecha_entrega);
        tabla_prestamos.refresh();
    }
}
