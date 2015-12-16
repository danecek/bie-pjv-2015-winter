/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

/**
 *
 * @author danecek
 */
class AnimationStep implements Runnable {

    final Circle c;
    Pane p;
    Velocity vel = new Velocity(1,1);

    public AnimationStep(Circle c) {
        this.c = c;
        p = (Pane)c.getParent();
    }

    @Override
    public void run() {
        Position actPos = new Position(c.getCenterX(), c.getCenterY());
        Position newPos = actPos.aply(vel);
        if (newPos.getY() + c.getRadius() > p.getHeight())
          vel =  vel.invertY();
        System.out.println(newPos);
        c.setCenterX(newPos.getX());
        c.setCenterY(newPos.getY());
    }

}
