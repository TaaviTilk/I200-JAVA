package javaFX;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista Ellipse, mille ringjoone paksust saab kasutaja slideriga muuta.
 */
public class JavaFX_ellips extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 280, 350);
        primaryStage.setScene(scene);

        primaryStage.show();


        Slider slider = new Slider(0, 10, 10);

//        slider.setMin(0);
//        slider.setMax(20);
//        slider.setShowTickLabels(true);
//        slider.setShowTickMarks(true);
//        slider.setMajorTickUnit(5);
//        slider.setMinorTickCount(1);

        Ellipse e = new Ellipse(50, 100);
        e.setFill(Color.CORNFLOWERBLUE);
        e.setStroke(Color.BLUE);
        vbox.getChildren().addAll(slider,e);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(15);

        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            e.setStrokeWidth((Double) newValue);
        });

    }
}