package pong;

public class PongGameView extends jgame.GContainer{
	public PongGameView () {
		// Set the size.
	    setSize(640, 480);

	    // Create a paddle to add.
	    Paddle paddle = new Paddle();

	    // Add the paddle to the game view.
	    add(paddle);
	    // Set the paddle's x position.
	    paddle.setX(50);

	    // Set the paddle's y position.
	    paddle.setY(480 / 2);
	    
	}
}
