import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class week5_1 extends Application {

    public void start(Stage primaryStage) {
        //Create the pane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);

        Group textGroup = new Group();

        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 35);

        String welcome = "Welcome to Java";
        double rotation = 90;

        for (char c : welcome.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                Text text = new Text(Character.toString(c));
                text.setFont(font);

                Rotate rotationMatrix = new Rotate(rotation, 0, 100);
                text.getTransforms().add(rotationMatrix);

                textGroup.getChildren().add(text);
            }
            rotation += 23;
        }

        pane.getChildren().add(textGroup);

        Scene scene = new Scene(pane, 500, 500);


        primaryStage.setTitle("Welcome message");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}