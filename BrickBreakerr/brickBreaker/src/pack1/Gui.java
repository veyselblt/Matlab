package pack1;

import java.io.IOException;

import javax.swing.JFrame;

public class Gui {
	
	public Gui() {
		
		Label.frame = new JFrame();
		Label.frame.setTitle("İsimsizOyun");
		Label.frame.setSize(Label.sizeWidthScreenValue,Label.sizeHeightScreenValue);
		Label.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Label.frame.setLocationRelativeTo(null);
		Label.frame.setResizable(false);
		Label.frame.setVisible(true);
		Label.frame.addKeyListener(new KeyHandler());
		Label.frame.requestFocus();
		
		
			
		Draw ciz = new Draw();
		ciz.setBounds(0,0,Label.sizeWidthScreenValue,Label.sizeHeightScreenValue);
		ciz.setVisible(true);
		Label.frame.add(ciz);
	

		
		
	}

}
