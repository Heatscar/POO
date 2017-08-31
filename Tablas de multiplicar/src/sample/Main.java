package sample;
/**
 * Created by hecto on 16/11/2016.
 */
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Tabla de Multiplicar");
        primaryStage.setScene(new Scene(root, 463, 432));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}