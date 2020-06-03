package com.aabood.P3HW6n;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P3Hw6nApplication extends Application{

	public static void main(String[] args) {
		//SpringApplication.run(P3Hw6nApplication.class, args);
                launch(args);
	}

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/jpaPane1.fxml"));
        loader.setControllerFactory(SpringApplication.run(P3Hw6nApplication.class)::getBean);
        Pane pane = loader.load();
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Chapter 6 Homework");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
