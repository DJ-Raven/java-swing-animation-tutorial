package example4;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;

public class Ball {

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public RoundRectangle2D getSize() {
        return size;
    }

    public void setSize(RoundRectangle2D size) {
        this.size = size;
    }

    public Ball(Color color, RoundRectangle2D size) {
        this.color = color;
        this.size = size;
    }

    public Ball() {
    }

    private Color color;
    private RoundRectangle2D size;
}
