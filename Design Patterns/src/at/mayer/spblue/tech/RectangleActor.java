package at.mayer.spblue.tech;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectangleActor {
    private double x,y;

    public RectangleActor(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gc, int delta){
        this.x++;
    }
    public void render(Graphics graphics){
        graphics.drawRect((float)this.x,(float)this.y,20,20);
    }
}