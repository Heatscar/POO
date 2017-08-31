package sample;
/**
 * Created by hecto on 16/11/2016.
 */
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
public class Controller implements Initializable {
    public TextField Tabla;
    public TextField Lim;
    public TextArea Res;
    public Button Resul;
    public Button Limpiar;
    public void accionResultado(){
        int Tabla = Integer.parseInt(this.Tabla.getText());
        int Limite = Integer.parseInt(this.Lim.getText());
        String Res = "";
        for(int i = 1; i <= Limite; i++)
            Res += Integer.toString(Tabla) + "x" + Integer.toString(i) + "=" + Integer.toString(i * Tabla) + "\n";
        this.Res.setText(Res);
    }
    public void accionLimpiar() {
        Tabla.setText("");
        Res.setText(null);
        Lim.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
    }
}