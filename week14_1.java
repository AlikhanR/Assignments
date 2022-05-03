import java.io.*;
import java.net.*;
import java.util.Date;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class week14_1 extends Application {
    DataInputStream fromServer = null;

    private Label label = new Label("");

    public void start(Stage primaryStage) {

        StackPane pane = new StackPane();
        pane.getChildren().add(label);

        Scene scene = new Scene(pane, 300, 75);
        primaryStage.setTitle("Exercise31_04Client");
        primaryStage.setScene(scene);
        primaryStage.show(); // Display the stage

        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 8000);

            // Create an input stream to receive data from the server
            fromServer = new DataInputStream(socket.getInputStream());

            // Receive and display string from the server
            label.setText(fromServer.readUTF());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
