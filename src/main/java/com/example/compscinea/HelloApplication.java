package com.example.compscinea;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
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
        charts(tab2);
        Tab tab3 = new Tab("tab3");
        TabPane tabPane = new TabPane(tab, tab2, tab3);
        Scene scene = new Scene(tabPane,600, 600);
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
            imageView.setFitHeight(500);
            imageView.setFitWidth(600);
            tab.setContent(imageView);

        });


    }
    private static void charts(Tab tab) {
final CategoryAxis xAxis = new CategoryAxis();
final NumberAxis yAxis = new NumberAxis();
final BarChart<String,Number> bc =
        new BarChart<String,Number>(xAxis,yAxis);
bc.setTitle("Bar Chart");
xAxis.setLabel("Month");
yAxis.setLabel("Temperature");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Tokyo");
        series1.getData().add(new XYChart.Data("Jan", 7));
        series1.getData().add(new XYChart.Data("Feb", 6));
        series1.getData().add(new XYChart.Data("Mar", 4));
        series1.getData().add(new XYChart.Data("Apr", 5));
        series1.getData().add(new XYChart.Data("May", 6));
        series1.getData().add(new XYChart.Data("Jun", 7));
        series1.getData().add(new XYChart.Data("Jul", 6));
        series1.getData().add(new XYChart.Data("Aug", 4));
        series1.getData().add(new XYChart.Data("Sep", 4));
        series1.getData().add(new XYChart.Data("Oct", 3));
        series1.getData().add(new XYChart.Data("Nov", 2));
        series1.getData().add(new XYChart.Data("Dec", 1));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("New York");
        series2.getData().add(new XYChart.Data("Jan", 2));
        series2.getData().add(new XYChart.Data("Feb", 3));
        series2.getData().add(new XYChart.Data("Mar", 2));
        series2.getData().add(new XYChart.Data("Apr", 3));
        series2.getData().add(new XYChart.Data("May", 4));
        series2.getData().add(new XYChart.Data("Jun", 4));
        series2.getData().add(new XYChart.Data("Jul", 3));
        series2.getData().add(new XYChart.Data("Aug", 3));
        series2.getData().add(new XYChart.Data("Sep", 2));
        series2.getData().add(new XYChart.Data("Oct", 1));
        series2.getData().add(new XYChart.Data("Nov", 2));
        series2.getData().add(new XYChart.Data("Dec", 3));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("London");
        series3.getData().add(new XYChart.Data("Jan", 4));
        series3.getData().add(new XYChart.Data("Feb", 3));
        series3.getData().add(new XYChart.Data("Mar", 4));
        series3.getData().add(new XYChart.Data("Apr", 5));
        series3.getData().add(new XYChart.Data("May", 7));
        series3.getData().add(new XYChart.Data("Jun", 9));
        series3.getData().add(new XYChart.Data("Jul", 11));
        series3.getData().add(new XYChart.Data("Aug", 12));
        series3.getData().add(new XYChart.Data("Sep", 10));
        series3.getData().add(new XYChart.Data("Oct", 9));
        series3.getData().add(new XYChart.Data("Nov", 8));
        series3.getData().add(new XYChart.Data("Dec", 7));

        bc.getData().addAll(series1, series2, series3);
        tab.setContent(bc);


    }

}