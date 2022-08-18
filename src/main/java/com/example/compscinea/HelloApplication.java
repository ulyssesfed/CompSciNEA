package com.example.compscinea;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Tab tab = new Tab("tab");
       TabContent(tab);

        Tab tab2 = new Tab("tab2");
        Tab tab3 = new Tab("tab3");
        TabPane tabPane = new TabPane(tab, tab2, tab3);
        Scene scene = new Scene(tabPane,600, 500);
        stage.setTitle("U-Corp Inventory management system");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private static void TabContent(Tab tab) throws FileNotFoundException {
        Button button = new Button("press for chungus");
        button.setPrefHeight(100);
        button.setPrefHeight(100);
        FileInputStream input = new FileInputStream("C:\\Users\\ulyfl\\Documents\\CompSci NEA\\src\\main\\resources\\com\\example\\compscinea\\OIP.jpg");
        Image image = new Image(input, 100, 100, true, true);
        ImageView imageView = new ImageView(image);
        button.setGraphic(imageView);
        tab.setContent(button);
        button.setOnAction(event -> {
            //fills the frame with the image
            imageView.setFitHeight(600);
            imageView.setFitWidth(500);
            tab.setGraphic(imageView);

        });


    }
}