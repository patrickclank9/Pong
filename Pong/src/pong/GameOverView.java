package pong;

import java.awt.Image;

import jgame.GSprite;
import jgame.ImageCache;

public class GameOverView extends jgame.GContainer{
	public GameOverView(){
		super(new GSprite(ImageCache.forClass(Pong.class).get("gameover.png")));
		ImageCache cache = ImageCache.forClass(Pong.class);
		Image image = cache.get("gameover.png");
		GSprite sprite = new GSprite(image);
		
		
	}
}
