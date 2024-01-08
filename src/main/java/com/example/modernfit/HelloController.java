package com.example.modernfit;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ListView<String> myExercises;
    @FXML
    private ListView<String> myMeals;


    String[] exercise = {"Exercise 1","Exercise 2","Exercise 3","Exercise 4","Exercise 5","Exercise 5"};
    String[] meals = {"Meal 1","Meal 2","Meal 3"};


    String currentExercises;
    String currentMeals;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myExercises.getItems().addAll(exercise);
        myExercises.getSelectionModel().selectedItemProperty().addListener((observableValue, s, t1) -> currentExercises = myExercises.getSelectionModel().getSelectedItem());
        myMeals.getItems().addAll(meals);
        myMeals.getSelectionModel().selectedItemProperty().addListener((observableValue, s, t1) -> currentMeals = myMeals.getSelectionModel().getSelectedItem());
    }

}