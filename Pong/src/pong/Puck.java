package pong;

import jgame.GSprite;
import jgame.ImageCache;
import jgame.controller.ConstantMovementController;

private ConstantMovementController cmc;
public class Puck extends jgame.GSprite {

    public Puck () {
        super(ImageCache.forClass(Pong.class).get("puck.png"));
        cmc = new ConstantMovementController(-5, 0);
        addController(cmc);
    }

}