package pong;

import jgame.Context;
import jgame.GObject;
import jgame.ImageCache;
import jgame.controller.ControlScheme;
import jgame.controller.KeyboardLocationController;
import jgame.listener.ParentBoundsListener;

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
	 // Disallow movement out of bounds.
	    ParentBoundsListener limiter = new ParentBoundsListener() {
	        @Override
	        public void invoke(GObject target, Context context) {
	            // Get the parent's center height.
	            double parentHeight = getParent().getHeight();

	            // Get our y position.
	            double y = getY();

	            // Get our height, adjusting for scale.
	            double h = getHeight() * getScaleY();

	            // Compare.
	            if (y > parentHeight / 2) {
	                // We're in the lower half.
	                setY(parentHeight - h / 2);
	            } else {
	                // We're in the upper half.
	                setY(h / 2);
	            }
	        }
	    };

	    // Vertical only.
	    limiter.setValidateHorizontal(false);

	    // Add the listener.
	    addListener(limiter);
	}
}
