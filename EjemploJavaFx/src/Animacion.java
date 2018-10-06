
import Modelo.Carro;
import Modelo.Llanta;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.*;

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
    private Image fondo;
    private Image fondo2;
    private Image gato;
    private int variable = 0;
    private int varFondo;
    private Image muñeco;
    private Image muñeco2;
    private Image muñeco3;
    private  int movimiento;
    
     public Animacion(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.fondo = new Image("Imagen/image/fondo.png");
        this.fondo2 =  new Image("Imagen/image/fondo.png");
        this.gato = new Image("Imagen/image/cats.gif");
        this.carro = new Carro(30,450,30,50);
        this.llantas = new Llanta[2];
        this.llantas[0] = new Llanta(32,475,25);
       this.llantas[1] = new Llanta(60,475,25);
       this.variable = 0;
       this.varFondo = 1024;
       this.muñeco = new Image("Imagen/image/down1.png");
       this.muñeco2 = new Image("Imagen/image/right1.png");
      this.muñeco3 = new Image("Imagen/image/down0.png");
      this.movimiento = 1024;       
    }
    
    @Override
    public void handle(long l) {
        lapiz.clearRect(0, 0, 1024, 512);
        lapiz.drawImage(fondo,varFondo-1024,0);
        lapiz.drawImage(this.fondo2, varFondo, 0);
        if (varFondo <0)
            varFondo =1024;
        else
            varFondo--;
        
        lapiz.drawImage(muñeco, 500,10);
        lapiz.drawImage(this.gato, variable*132,0,132,80,movimiento,400,132, 80);
        lapiz.drawImage(muñeco2, 100,500);
        lapiz.drawImage(muñeco3, 400,500);
        if(movimiento == 1024)
            movimiento = 0;
        else
            movimiento++;
        lapiz.setFill(Color.YELLOW);
        lapiz.fillRect(carro.getXref(), carro.getYref() , this.carro.getAlto(), this.carro.getAncho());
        lapiz.setFill(Color.BLACK);
        this.carro.mover();
        lapiz.fillOval(llantas[0].getX(), llantas[0].getY(), llantas[0].getDiametro(),llantas[0].getDiametro());
        lapiz.fillOval(llantas[1].getX(), llantas[1].getY(), llantas[1].getDiametro(),llantas[1].getDiametro());
       this.llantas[0].mover();
       this.llantas[1].mover();
       lapiz.strokeRect(500,400,50,50);
       lapiz.strokeRect(this.carro.getXref(), 400, 20, 20);
       Shape gato= new Rectangle(movimiento, 400, 132, 80);
       Shape muñeco1  = new Rectangle(500,10,50,50);
       Shape muñeco2 = new Rectangle(100,500,50,50);
       Shape muñeco3 = new Rectangle (400,500,50,50);
       Shape interseccion = SVGPath.intersect(gato, muñeco1);
       Shape interseccion2 = SVGPath.intersect(gato, muñeco2);
       if (interseccion.getBoundsInLocal().getWidth()!=-1){
           stop();
       }
       
      
       
       
        
        
    }

   

    public Animacion() {
        
    }
    
}
