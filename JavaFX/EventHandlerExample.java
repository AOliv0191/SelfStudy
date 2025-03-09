import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EventHandlerExample extends Application implements EventHandler<ActionEvent>{
    Button btn;
    Button btn2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of Window");
        
        btn = new Button("Soy un boton");        
        btn.setOnAction(this);

        btn2 = new Button("Soy otro boton");
        btn2.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(btn);
        layout.getChildren().add(btn2);//ver como poner el otro boton

        Scene scn = new Scene(layout, 300, 250);

        primaryStage.setScene(scn);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == btn){
            System.out.println("Tocaste el boton!!!");
        }
        if(event.getSource() == btn2){
            System.out.println("Tocaste el otro boton!!!");
        }
    }
}
