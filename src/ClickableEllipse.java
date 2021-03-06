import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.Ellipse;


public class ClickableEllipse extends Ellipse {
	
	private Body _body;
	
	public ClickableEllipse(Body body) {
	
		_body = body;
		
		setColor(Color.green);
		setSize(80, 80);
		
	}
	
	public void mouseClicked(MouseEvent e) {
		
		if (getColor() == (Color.green)) {
			
			_body.setColor(Color.blue);
		}
		
		else {
			
			_body.setColor(Color.green);
		}
		
	}
}
