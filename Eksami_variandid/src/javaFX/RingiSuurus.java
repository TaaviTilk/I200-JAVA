package javaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista ring, mille suurust saab kasutaja Slideriga muuta
 */
public class RingiSuurus extends Application{

    public void start(Stage primaryStage) throws Exception {

    VBox vbox = new VBox();
    Scene scene = new Scene(vbox, 280, 350);
    primaryStage.setScene(scene);

    primaryStage.show();


    Slider slider = new Slider(0, 50, 50);
    Circle e = new Circle(150);
    e.setFill(Color.CORNFLOWERBLUE);
    e.setStroke(Color.BLUE);
    vbox.getChildren().addAll(slider,e);
    vbox.setAlignment(Pos.CENTER);
    vbox.setSpacing(15);

    slider.valueProperty().addListener((observable, oldValue, newValue) -> {
        e.setRadius((Double) newValue);
    });

}
}
