package io.github.jesraali;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import io.github.jesraali.algorithms.arrays.*;

import java.io.IOException;

public class Main extends Application {



    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/Screen1.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene scene = new Scene(rootLayout, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Search Algorithm Visualiser");
        stage.show();
    }


    public static void main(String[] args) {


        launch(args);
//        int[] array = {1, 2, 5, 8, 2, 4, 6};
//        int[] sortedArray = {1, 2, 2, 4, 5, 6, 8};
//
//        int searchValue = 8;
//
//        BinarySearch binarySearch = new BinarySearch();
//        System.out.println(binarySearch.run(sortedArray,searchValue));

//        LinearSearch linearSearch = new LinearSearch(array,searchValue);
//        System.out.println(linearSearch.run());
//
//        SentinelLinearSearch sentinelLinearSearch = new SentinelLinearSearch(array,searchValue);
//        System.out.println(sentinelLinearSearch.run());

//        TernarySearch ternarySearch = new TernarySearch();
//        System.out.println(ternarySearch.run(sortedArray,searchValue));

//        JumpSearch jumpSearch = new JumpSearch(sortedArray,searchValue);
//        System.out.println(jumpSearch.run());
    }
}