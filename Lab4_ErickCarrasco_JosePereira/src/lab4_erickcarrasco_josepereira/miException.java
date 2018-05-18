
package lab4_erickcarrasco_josepereira;



import java.awt.Color;


public class miException extends Exception{
    private Color color;

    public miException() {
        super();
    }

    public miException(Color color,String message) {
        super(message);
        this.color = color;   
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "miException{" + "color=" + color + '}';
    }
       
}
