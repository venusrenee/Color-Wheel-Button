import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class ColorWheelButton extends Application {
    private double rotationAngle = 0;

    public void start(Stage primaryStage) {
        
        Arc arc1 = new Arc(300, 300, 200, 200, 0, 90);
        arc1.setType(ArcType.ROUND);
        arc1.setFill(Color.BLUE);

        Arc arc2 = new Arc(300, 300, 200, 200, 90, 90);
        arc2.setType(ArcType.ROUND);
        arc2.setFill(Color.RED);

        Arc arc3 = new Arc(300, 300, 200, 200, 180, 90);
        arc3.setType(ArcType.ROUND);
        arc3.setFill(Color.YELLOW);

        Arc arc4 = new Arc(300, 300, 200, 200, 270, 90);
        arc4.setType(ArcType.ROUND);
        arc4.setFill(Color.GREEN);

        Group colorWheel = new Group(arc1, arc2, arc3, arc4);

        Button rotateButton = new Button("Rotate Right");
        rotateButton.setLayoutX(600);
        rotateButton.setLayoutY(300);
        rotateButton.setOnAction(event ->{
            rotationAngle += 90;
            colorWheel.setRotate(rotationAngle);
        });

        Group root = new Group(colorWheel, rotateButton);

        Scene scene = new Scene(root, 800, 600, Color.GREY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/* I used the websites: 
 * https://jenkov.com/tutorials/javafx/button.html#:~:text=button%20will%20do.-,Creating%20a%20Button,parameters%20to%20the%20Button%20constructor.
 * http://www.java2s.com/ref/java/javafx-button-set-layout-position.html
 * to help me with the mechanics and layout of the button
 */
