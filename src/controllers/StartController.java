package controllers;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class StartController {

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    private Button closeButton;
    @FXML
    private TextField width;
    @FXML
    private TextField height;

    @FXML
    private void close() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void confirm() throws IOException {
        if (isInputValid(width) && isInputValid(height)) {
            int widthValue = (Integer.parseInt(width.getText()));
            int heightValue = (Integer.parseInt(height.getText()));
            System.out.println("K");

            Parent root = FXMLLoader.load(getClass().getResource("../views/grid.fxml"));

            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.setScene(new Scene(root, 600, 400));

            //make the window movable
            root.setOnMousePressed(event -> {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            });

            root.setOnMouseDragged(new EventHandler<>() {
                @Override
                public void handle(MouseEvent event) {
                    stage.setX(event.getScreenX() - xOffset);
                    stage.setY(event.getScreenY() - yOffset);
                }
            });
        } else System.out.println("ERR");
    }

    // Validates the user input.
    private boolean isInputValid(TextField t) {
        boolean b = false;
        if (!(t.getText() == null || t.getText().length() == 0)) {
            try {
                int d = Integer.parseInt(t.getText());
                if (4 < d && d < 10) {
                    b = true;
                }
                else System.out.println("Must be between 4 and 10");
            }
            catch (NumberFormatException e) {
                System.out.println("Not a Number");
            }
        }
        return b;
    }



}
