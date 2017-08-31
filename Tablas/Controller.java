package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public TextField tfTabla;
    @FXML
    public TextField tfLimite;
    @FXML
    public TextArea taResultado;
    @FXML
    public Button bttResultado;
    @FXML
    public Button bttLimpiar;

    public void accionResultado(){

        int Tabla = Integer.parseInt(this.tfTabla.getText());
        int Limite = Integer.parseInt(this.tfLimite.getText());
        String taResultado = "";

        for(int i = 1; i <= Limite; i++)
            taResultado += Integer.toString(Tabla) + "x" + Integer.toString(i) + "=" + Integer.toString(i * Tabla) + "\n";
        this.taResultado.setText(taResultado);
        }

    public void accionLimpiar() {
        tfTabla.setText("");
        taResultado.setText(null);
        tfLimite.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
