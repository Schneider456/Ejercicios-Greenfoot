import greenfoot.*;  

public class PongWorld  extends World {

    Paddle p1 = new Paddle("a", "s");
    Paddle p2 = new Paddle("left", "right");
    
    public PongWorld() {     
        super(700, 500, 1);
        addObject(p1, 350, 30);
        addObject(p2, 350, 470);
        addObject(new Ball(), 350, 250);
    }
    
    @Override
    public void act () {
        this.showText("P2: " + p1.regresarPuntaje(), 30, 480);
        this.showText("P1: " + p2.regresarPuntaje(), 30, 20);
        if (p1.regresarPuntaje() == 5 || p2.regresarPuntaje() == 5) {
            Greenfoot.stop();
            
            if (p1.regresarPuntaje() == 5) {
                this.showText("Ha ganado el jugador numero 2", 350, 200);
            }
            
            if (p2.regresarPuntaje() == 5) {
                this.showText("Ha ganado el jugador numero 1", 350, 200);
            }
            
       }
    }
}