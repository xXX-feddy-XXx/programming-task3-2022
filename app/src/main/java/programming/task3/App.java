/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package programming.task3;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import programming.task3.Controller.Controller;


public class App extends Application {




    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gridpaneregular.fxml"));
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Controller) loader.getController()).updateBoard();
}

    public static void main(String[] args) {
        Application.launch();
    }

}



