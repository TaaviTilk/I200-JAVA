package Toidupaevik;

import javafx.application.Application;
import javafx.stage.Stage;
//käivitab kogu programmi
public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        new Tervitus();
    }
}