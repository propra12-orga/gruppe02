import java.applet.*;   //Pakete importieren
import java.awt.*;

public class Bomb2 extends Applet  //Applet Grundgerüst
{
	public void init()
	{
		setBackground (Color.lightGray);   // Hintergrundfarbe
	}

	public void start ()
	{
		
	}

	public void stop()
	{

	}

	public void destroy()
	{

	}

	

	public void paint (Graphics g)
	{
		g.setColor  (Color.darkGray); // Farbe für die festen Mauersteine
		
		g.fillRect  (24,24,24,24);    // Steine, 1. Reihe senkrecht
		g.fillRect  (24,72,24,24);
		g.fillRect  (24,120,24,24);
		g.fillRect  (24,168,24,24);
		g.fillRect  (24,216,24,24);
		
		g.fillRect  (72,24,24,24);    // Steine, 2. Reihe senkrecht
		g.fillRect  (72,72,24,24);
		g.fillRect  (72,120,24,24);
		g.fillRect  (72,168,24,24);
		g.fillRect  (72,216,24,24);
		
		g.fillRect  (120,24,24,24);    // Steine, 3. Reihe senkrecht
		g.fillRect  (120,72,24,24);
		g.fillRect  (120,120,24,24);
		g.fillRect  (120,168,24,24);
		g.fillRect  (120,216,24,24);
		
		g.fillRect  (168,24,24,24);    // Steine, 4. Reihe senkrecht
		g.fillRect  (168,72,24,24);
		g.fillRect  (168,120,24,24);
		g.fillRect  (168,168,24,24);
		g.fillRect  (168,216,24,24);
		
		g.fillRect  (216,24,24,24);    // Steine, 5. Reihe senkrecht
		g.fillRect  (216,72,24,24);
		g.fillRect  (216,120,24,24);
		g.fillRect  (216,168,24,24);
		g.fillRect  (216,216,24,24);
		
		g.fillRect  (264,24,24,24);    // Steine, 6. Reihe senkrecht
		g.fillRect  (264,72,24,24);
		g.fillRect  (264,120,24,24);
		g.fillRect  (264,168,24,24);
		g.fillRect  (264,216,24,24);
		
		
	
	}

}
