package views;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

class RoundedBorder implements Border {

    private int radius;
    private Color col;
    private Insets inset;

    RoundedBorder(int radius, Color col, Insets inset) {
        this.radius = radius;
        this.col = col;
        this.inset = inset;
    }
    
    RoundedBorder(int radius, Color col, Insets inset, boolean isFat) {
        this.radius = radius;
        this.col = col;
        this.inset = inset;
    }

    public Insets getBorderInsets(Component c) {
        return inset;
    }

    public boolean isBorderOpaque() {
        return false;
    }
    
//    protected void paintComponent(graphics g) 

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
    	g.setColor(col);
        g.drawRoundRect(0, 0, width-1, height-1, radius, radius);
    }

}
