
import Modelo.Carro;
import Modelo.Llanta;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Animacion  extends AnimationTimer{

    private GraphicsContext lapiz;
    private Carro carro;
    private Llanta[] llantas;
    
     public Animacion(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro = new Carro(30,450,30,50);
        this.llantas = new Llanta[2];
        this.llantas[0] = new Llanta(32,475,25);
       this.llantas[1] = new Llanta(60,475,25);
    }
    
    @Override
    public void handle(long l) {
        lapiz.clearRect(0, 0, 500, 500);
        lapiz.setFill(Color.YELLOW);
        lapiz.fillRect(carro.getXref(), carro.getYref() , this.carro.getAlto(), this.carro.getAncho());
        lapiz.setFill(Color.BLACK);
        this.carro.mover();
       
        lapiz.fillOval(llantas[0].getX(), llantas[0].getY(), llantas[0].getDiametro(),llantas[0].getDiametro());
        lapiz.fillOval(llantas[1].getX(), llantas[1].getY(), llantas[1].getDiametro(),llantas[1].getDiametro());
       this.llantas[0].mover();
       this.llantas[1].mover();
       
        
        
    }

   

    public Animacion() {
        
    }
    
}
