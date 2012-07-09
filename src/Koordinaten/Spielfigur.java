	import java.awt.Image;
	import java.awt.Panel;
	import java.awt.Toolkit;
    import java.util.ArrayList;
    import Koordinaten.Koordinaten;

	public class Spielfigur {

	    private String name;
	    private Image aussehen;
	    private Koordinaten spielerKoordinaten;
	    public ArrayList<Image> bewegungRechts = new ArrayList<Image>();
	    public ArrayList<Image> bewegungLinks = new ArrayList<Image>();
	    public ArrayList<Image> bewegungOben = new ArrayList<Image>();
	    public ArrayList<Image> bewegungUnten = new ArrayList<Image>();
	    Toolkit tk = getToolkit();

	    /**
	     * name Name der Spielfigur
	     * aussehen Bild der Spielfigur
	     * spielerKoordinaten X- und Y-Koordinaten der Spielfigur
	     
	     */
	    public Spielfigur(String name, Image aussehen, Koordinaten spielerKoordinaten) {
	        this.name = name;
	        this.aussehen = aussehen;
	        this.spielerKoordinaten = spielerKoordinaten;
	     

	        //Spielfigurbilder in arraylists laden
	        this.bewegungRechts.add(tk.getImage("src/Bilder/Figur/walking e0000.bmp"));
	        this.bewegungRechts.add(tk.getImage("src/Bilder/Figur/walking e0001.bmp"));
	        this.bewegungRechts.add(tk.getImage("src/Bilder/Figur/walking e0002.bmp"));
	        this.bewegungRechts.add(tk.getImage("src/Bilder/Figur/walking e0003.bmp"));
	        this.bewegungLinks.add(tk.getImage("src/Bilder/Figur/walking w0000.bmp"));
	        this.bewegungLinks.add(tk.getImage("src/Bilder/Figur/walking w0001.bmp"));
	        this.bewegungLinks.add(tk.getImage("src/Bilder/Figur/walking w0002.bmp"));
	        this.bewegungLinks.add(tk.getImage("src/Bilder/Figur/walking w0003.bmp"));
	        this.bewegungOben.add(tk.getImage("src/Bilder/Figur/walking n0000.bmp"));
	        this.bewegungOben.add(tk.getImage("src/Bilder/Figur/walking n0001.bmp"));
	        this.bewegungOben.add(tk.getImage("src/Bilder/Figur/walking n0002.bmp"));
	        this.bewegungUnten.add(tk.getImage("src/Bilder/Figur/walking s0000.bmp"));
	        this.bewegungUnten.add(tk.getImage("src/Bilder/Figur/walking s0002.bmp"));
	        this.bewegungUnten.add(tk.getImage("src/Bilder/Figur/walking s0003.bmp"));
	    }

	    
	
	    public String toString() {
	        return "Name: " + this.name + "\n" +
	                "Koordinaten: " + this.spielerKoordinaten;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAussehen(Image aussehen) {
	        this.aussehen = aussehen;
	    }

	    public void setSpielerKoordinate(Koordinaten spielerKoordinaten) {
	        this.spielerKoordinaten = spielerKoordinaten;
	    }

	   

	    public void setBewegungRechts(ArrayList<Image> bewegungRechts) {
	        this.bewegungRechts = bewegungRechts;
	    }

	    public void setBewegungLinks(ArrayList<Image> bewegungLinks) {
	        this.bewegungLinks = bewegungLinks;
	    }

	    public void setBewegungOben(ArrayList<Image> bewegungOben) {
	        this.bewegungOben = bewegungOben;
	    }

	    public void setBewegungUnten(ArrayList<Image> bewegungUnten) {
	        this.bewegungUnten = bewegungUnten;
	    }

	    public String getName() {
	        return name;
	    }

	    public Image getAussehen() {
	        return aussehen;
	    }

	    public Koordinaten getSpielerKoordinate() {
	        return this.spielerKoordinaten;
	    }

	   

	    public ArrayList<Image> getBewegungRechts() {
	        return this.bewegungRechts;
	    }

	    public ArrayList<Image> getBewegungLinks() {
	        return this.bewegungLinks;
	    }

	    public ArrayList<Image> getBewegungOben() {
	        return this.bewegungOben;
	    }

	    public ArrayList<Image> getBewegungUnten() {
	        return this.bewegungUnten;
	    }
	    
	}