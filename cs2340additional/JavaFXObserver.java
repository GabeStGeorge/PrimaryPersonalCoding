import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class JavaFXObserver extends Application implements Observer {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Testing Observer");
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);
        root.getChildren().add(new Label("Testing Observer"));
        root.setBackground(new javafx.scene.layout.Background(new javafx.scene.layout.BackgroundFill(
                Color.DIMGREY, null, null)));
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void update() {}

}
