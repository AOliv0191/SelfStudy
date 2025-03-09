import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hola Mundo");

        Button btn = new Button("Soy un boton");
        //btn.setText("Soy un boton"); *Alternativa 

        StackPane layout = new StackPane();
        layout.getChildren().add(btn);

        Scene scn = new Scene(layout, 300, 250);

        primaryStage.setScene(scn);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
