package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
	
	Timer timer;
	
	public Movement(){
		
		timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Label.moveup == true){
					
					if(Label.bordY>=10){
						Label.bordY-=+5;
					}
				}
				
				else if(Label.movedown == true){
					if(Label.bordY<=410){
						Label.bordY+=5;
					}
				}
					
				
			}
		}, 0, 20);
		
	}

	
}
