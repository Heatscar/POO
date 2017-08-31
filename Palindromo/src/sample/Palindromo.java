package sample;
/**
 * Created by hecto on 28/11/2016.
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class Palindromo{
    public String Espacios(String frase) {
        String Aux="";
        char[] aux = frase.toCharArray();
        for(int i = 0; i < aux.length; i++){
            if(aux[i] != ' '){Aux+=aux[i];}
        }
        return Aux;
    }
    public String Cadena(char[] caracteres) {
        String cadena = "";
        int i = caracteres.length - 1;
        while(i >= 0){
            cadena += caracteres[i];
            i--;
        }
        return cadena;
    }
    public Boolean Verificar(String cad1, String cad2) {
        boolean result;
        cad1 = this.Espacios(cad1);
        cad2 = this.Espacios(cad2);
        if(cad1.equals(cad2)){return true;}
        else{return false;}
    }
    public ObservableList llenar(char[] caracteres){
        ObservableList lista = FXCollections.observableArrayList();
        for(char c:caracteres){
            if(c != ' ') {
                lista.add(c);}
        }
        return lista;
    }
}