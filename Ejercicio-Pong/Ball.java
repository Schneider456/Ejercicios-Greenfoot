import greenfoot.*;  
import java.util.Random;
import java.util.ArrayList;

public class Ball  extends Actor {  
    private int incx;
    private int incy;
    
    public Ball () {       
        incx = 4;
        incy = 4;
        this.direccionRandom();
    }
    
    @Override
    public void act() {
        World mundo = this.getWorld();
        ArrayList<Paddle> jugadores = (ArrayList)mundo.getObjects(Paddle.class);
        
        this.setLocation(this.getX() + incx, this.getY() + incy);
        
        if (this.getX() == 0 || this.getX() > mundo.getWidth() - 5) {
            incx = -incx;
        } 
        
        if(this.getY() == 0) {
            this.setLocation(350, 250);
            this.direccionRandom();
            (jugadores.get(0)).incrementarPuntaje();
        }
        
        if(this.getY() > mundo.getHeight() - 3 ) {
            this.setLocation(350, 250);
            this.direccionRandom();
            (jugadores.get(1)).incrementarPuntaje();
        }
        
        if(this.isTouching(Paddle.class)) {
            incy = -incy;
        }
    }    
    
    public void direccionRandom () {
        Random  rnd = new Random();
        
        if (rnd.nextDouble() < 0.5) {
            incx = -incx;
        }
        
        if (rnd.nextDouble() < 0.5) {
            incy = -incy;
        }
    }
    
}
