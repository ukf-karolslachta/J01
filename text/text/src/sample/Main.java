package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root,600,400);
        primaryStage.setTitle("Cvičenie 2 ");
        Scanner vstup = new Scanner(System.in);
        primaryStage.show();
        int samohlasky = 0;
        int spoluhlasky = 0;
        String text = vstup.nextLine();
        int  r,g,b;
        for(int i = 0; i < text.length();i++){
            String znak = text.substring(i,i+1);
            if (znak.matches("[aeiouyäáéíóôúýAEIOUYÁÉÍÓÚÝ]")) samohlasky++;
            if (znak.matches("[dtnlhkgďťňľcčžšjmbpvzsfrDTNLHKGĎŤŇĽCČŽŠJMBPVZSFR]")) spoluhlasky++;
        }
        if ((samohlasky*16)<=255) {
            r = samohlasky*16;
        } else {
            r = 255;
        }

        if ((spoluhlasky*16)<=255) {
            g = spoluhlasky*16;
        } else {
            g = 255;
        }

        if (((text.length()%25)*10)<=255) {
            b = (text.length()%25)*10;
        } else {
            b = 255;
        }
        scene.setFill(Color.rgb(r,g,b));
        Text t = new Text();
        t.setText(text);
        t.setFont(Font.font("Calibri",35));
        t.setFill(Color.ANTIQUEWHITE);
        t.layoutXProperty().bind(scene.widthProperty().subtract(t.prefWidth(-1)).divide(2));
        t.layoutYProperty().bind(scene.heightProperty().subtract(t.prefHeight(-1)).divide(2));
        root.getChildren().addAll(t);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
