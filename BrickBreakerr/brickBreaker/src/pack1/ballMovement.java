package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class ballMovement {
	
	Timer timer;
	public ballMovement(){
		
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				Label.ballX += Label.balldirX;
				Label.ballY += Label.balldirY;
				
			}
		}, 0, 2);
		
		
	}

}
