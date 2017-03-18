import greenfoot.*;  

public class Paddle  extends Actor {
    private int puntaje;
    private int vel; 
    private String derecha;
    private String izquierda;
    
    public Paddle(String izq, String der) {
        puntaje = 0;
        vel = 5;
        izquierda = izq;
        derecha = der;
    }
    
    @Override
    public void act() {
        if(Greenfoot.isKeyDown(izquierda)) {
            this.setLocation(this.getX() - vel, this.getY());
        }
        
        if(Greenfoot.isKeyDown(derecha)) {
            this.setLocation(this.getX() + vel, this.getY());
        }
    }
    
    public void incrementarPuntaje() {
        puntaje++;
    }
    
    public int regresarPuntaje() {
        return puntaje;
    }
}
