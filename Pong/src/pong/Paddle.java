package pong;

import java.awt.Image;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.controller.ControlScheme;
import jgame.controller.KeyboardLocationController;

public class Paddle extends jgame.GSprite{
	public Paddle(ControlScheme cs) {
	    // Get the image cache, get the image, and call the super constructor.
	    super(ImageCache.forClass(Pong.class).get("paddle.png"));

	    // Create a keyboard movement controller.
	    KeyboardLocationController klc = new KeyboardLocationController(cs, 10);

	    // Add the new controller.
	    addController(klc);

	    // Disable horizontal movement.
	    klc.setHorizontalAllowed(false);
	}
}
