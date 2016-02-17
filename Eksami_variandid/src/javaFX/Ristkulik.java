package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik extends Application {

    public void start(Stage primaryStage) throws Exception {

    VBox vbox = new VBox();
    Scene scene = new Scene(vbox, 280, 350);
    primaryStage.setScene(scene);


        TextField x = new TextField("100");
        TextField y = new TextField("100");
        TextField k = new TextField("50");
        TextField l = new TextField("50");



        Button nupp = new Button("loo ristkulik");
        Rectangle r = new Rectangle();


        nupp.setOnAction(event -> {
            String x1 = k.getText();
            double x2 = Double.parseDouble(x1);
            String y1 = k.getText();
            double y2 = Double.parseDouble(y1);
            String k1 = k.getText();
            double k2 = Double.parseDouble(k1);
            String l1 = l.getText();
            double l2 = Double.parseDouble(l1);
            //double k1 = Double.parseDouble(TextField.getString(k));
            //double l1 = Double.parseDouble(TextField.getString(l));

            r.setX(x2);
            r.setY(y2);
            r.setHeight(k2);
            r.setWidth(l2);
                    });

        vbox.getChildren().addAll(x, y,k, l, nupp,r);


        primaryStage.show();
    }
}
