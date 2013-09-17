package pong;

import java.util.List;

import jgame.GObject;
import jgame.controller.ControlScheme;
import jgame.listener.FrameListener;

public class PongGameView extends jgame.GContainer{
	public PongGameView () {
		// Set the size.
	    setSize(640, 480);

	    // Create a paddle to add.
	    Paddle paddle = new Paddle(ControlScheme.WASD);
	    Paddle paddle2 = new Paddle(ControlScheme.IJKL);
	    // Add the paddle to the game view.
	    add(paddle);
	    add(paddle2);
	    // Set the paddle's x position.
	    paddle.setX(50);
	    paddle2.setX(590);

	    // Set the paddle's y position.
	    paddle.setY(480 / 2);
	    paddle2.setY(480 / 2);
	    // Create a puck.
	    Puck puck = new Puck();

	    // Add the puck.
	    addAtCenter(puck);
	    
	    FrameListener fl = new FrameListener() {

	        @Override
	        public void invoke(GObject target, Context context) {
	            // Get all the pucks.
	            List<Puck> pucks = context.getInstancesOfClass(Puck.class);

	            // Is it empty?
	            boolean noPucksLeft = pucks.isEmpty();
	        }
	    };
	}
}
