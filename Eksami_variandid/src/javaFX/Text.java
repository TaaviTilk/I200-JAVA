package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Loo Label, mille sisu saab kasutaja TextFieldi kaudu muuta.
 */
public class Text extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox kastid = new VBox();
        Scene scene = new Scene(kastid, 150, 150);
        primaryStage.setScene(scene);

        Label silt = new Label("mingi");
        TextField kirjuta = new TextField();

        kirjuta.setOnAction(event -> {
            String b = kirjuta.getText();
            System.out.println(b);
            silt.setText(b);
        });

        kastid.getChildren().addAll(silt, kirjuta);

        primaryStage.show();

    }

}
