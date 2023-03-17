package com.ad17yakr.learnspringframework;

import com.ad17yakr.learnspringframework.game.GameRunner;
import com.ad17yakr.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}
}
