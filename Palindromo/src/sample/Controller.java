package sample;
/**
 * Created by hecto on 28/11/2016.
 */
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javax.swing.*;
public class Controller {
    Palindromo pal = new Palindromo();
    public String cad = "";
    public String cad2 = "";
    public TextField cadf;
    public Button Aceptar;
    public Button Borrar;
    public ListView textO;
    public ListView textI;
    public void Mostrar(ActionEvent actionEvent) {
        if(cadf.getText().length() > 0) {
            cad = cadf.getText();
            char[] caracteres = cad.toCharArray();
            textO.setItems(pal.llenar(caracteres));
            cad2 = pal.Cadena(caracteres);
            char[] caracteres2 = cad2.toCharArray();
            textI.setItems(pal.llenar(caracteres2));
        }
        else{cadf.requestFocus();}
    }
    public void click(ActionEvent actionEvent){
        if(cadf.getText().length() > 0){
            if(cad.length() == 0 && cad2.length() == 0) {
                this.Mostrar(actionEvent);
            } else if(!cadf.getText().equals(cad)) {
                this.Mostrar(actionEvent);
            }
            if (pal.Verificar(this.cad, this.cad2)) {
                JOptionPane.showMessageDialog(null, "Es un palindromo");
            } else {
                JOptionPane.showMessageDialog(null, "No es un palindromo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            cadf.requestFocus();
        }
    }
    public void Limpiar(ActionEvent actionEvent) {
        cadf.setText("");
        textO.setItems(null);
        textI.setItems(null);
        cadf.requestFocus();}
}