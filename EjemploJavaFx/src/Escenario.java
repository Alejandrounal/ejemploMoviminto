/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
public class Escenario extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane layout = new Pane();
        Canvas canvas = new Canvas(500,500);
        layout.getChildren().add(canvas);
        Scene escena = new Scene(layout,500,500,Color.AZURE);
        
    
        
        GraphicsContext lapiz = canvas.getGraphicsContext2D();
        
        Animacion juego = new Animacion(lapiz);
        juego.start();
        
        
        lapiz.setFill(Color.YELLOW);
        /*lapiz.fillRect(30,450 , 50, 30);
         lapiz.setFill(Color.BLACK);
        lapiz.fillOval(32, 475, 20,20);
        lapiz.fillOval(60, 475,20, 20);   */
        lapiz.setFill(Color.BLACK);
        lapiz.fillRect(400, 250, 70, 100);
        lapiz.setFill(Color.RED);
        lapiz.fillOval(420,260, 25, 25);
        lapiz.setFill(Color.YELLOW);
        lapiz.fillOval(420,290, 25, 25);
        lapiz.setFill(Color.GREEN);
        lapiz.fillOval(420,320, 25, 25);
        lapiz.setFill(Color.BLACK);
        lapiz.fillRect(420, 350, 30,130 );
        lapiz.fillText(" Puntaje:  100", 400, 50);
        
        
        
        
        stage.setScene(escena);
        stage.setTitle("Ejemplo");
        stage.show();
        
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
