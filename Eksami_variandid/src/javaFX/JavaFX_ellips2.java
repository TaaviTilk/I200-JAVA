package javaFX;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Ellips, mille taustavärvi saab kasutaja muuta.
 */
public class JavaFX_ellips2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 250, 250);
        primaryStage.setScene(scene);

        Button nupp = new Button("Muuda värvi");

        Ellipse e = new Ellipse(50, 100);
        e.setFill(Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));

        vbox.getChildren().addAll(e, nupp);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        nupp.setOnAction(event1 -> {
            e.setFill(Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        });

        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> System.exit(0));
    }
}
