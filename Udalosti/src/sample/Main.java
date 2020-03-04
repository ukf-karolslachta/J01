package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root,702,406);
        primaryStage.setTitle("FX APK");
        scene.setFill(Color.BLACK);
        Line prva = new Line();
        prva.setStartX(50);
        prva.setStartY(320);
        prva.setEndX(25);
        prva.setEndY(345);
        prva.setFill(Color.PURPLE);
        prva.setStroke(Color.PURPLE);
        prva.setStrokeWidth(10);
        Line prva1 = new Line();
        prva1.setStartX(25);
        prva1.setStartY(345);
        prva1.setEndX(100);
        prva1.setEndY(345);
        prva1.setFill(Color.PURPLE);
        prva1.setStroke(Color.PURPLE);
        prva1.setStrokeWidth(10);
        Line prva2 = new Line();
        prva2.setStartX(100);
        prva2.setStartY(345);
        prva2.setEndX(25);
        prva2.setEndY(250);
        prva2.setFill(Color.PURPLE);
        prva2.setStroke(Color.PURPLE);
        prva2.setStrokeWidth(10);
        Line prva3 = new Line();
        prva3.setStartX(25);
        prva3.setStartY(250);
        prva3.setEndX(100);
        prva3.setEndY(250);
        prva3.setFill(Color.PURPLE);
        prva3.setStroke(Color.PURPLE);
        prva3.setStrokeWidth(10);
        Line prva4 = new Line();
        prva4.setStartX(100);
        prva4.setStartY(250);
        prva4.setEndX(75);
        prva4.setEndY(280);
        prva4.setFill(Color.PURPLE);
        prva4.setStroke(Color.PURPLE);
        prva4.setStrokeWidth(10);
        Polyline druha = new Polyline();
        druha.getPoints().addAll(new Double[]{200.0,320.0,180.0,345.0,160.0,250.0,240.0,250.0,230.0,280.0,200.0,280.0});
       // druha.setFill(Color.YELLOW);
        druha.setStroke(Color.YELLOW);
        druha.setStrokeWidth(10);
        Polyline tretia = new Polyline();
        tretia.getPoints().addAll(new Double[]{350.0,250.0,300.0,345.0,400.0,345.0,365.0,295.0});
        tretia.setStroke(Color.RED);
        tretia.setStrokeWidth(10);
        Polyline stvrta = new Polyline();
        stvrta.getPoints().addAll(new Double[]{600.0,250.0,500.0,250.0,550.0,345.0,585.0,280.0});
        stvrta.setStroke(Color.GREEN);
        stvrta.setStrokeWidth(10);
        Polyline piaty = new Polyline();
        piaty.getPoints().addAll(new Double[]{750.0,315.0,725.0,315.0,700.0,345.0,800.0,345.0,750.0,250.0,735.0,280.0});
        piaty.setStrokeWidth(10);
        piaty.setStroke(Color.LIGHTBLUE);
        root.getChildren().addAll(prva,prva1,prva2,prva3,prva4,druha,tretia,stvrta,piaty);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
