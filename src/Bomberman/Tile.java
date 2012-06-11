package Bomberman;

import javax.swing.ImageIcon;

public class Tile {
	
	private ImageIcon image;
	private boolean blocked;
	
	Tile(char type){
		switch(type){
		case 'X' :	setBlocked(true);
					setImage(ImageLoader.getTileImage(type));
					break;
					
		case 'G' :	setBlocked(false);
					setImage(ImageLoader.getTileImage(type));
					break;
					
		default:	setBlocked(false);
					setImage(ImageLoader.getTileImage(type));
					break;
	}
		
	}
	
	public ImageIcon getImage(){
		return image;
	}
	
	public void setImage(ImageIcon image){
		this.image = image;
	}
	
	public boolean isBlocked(){
		System.out.println("Tile says blocked set to: " + blocked);
		return blocked;
	}
	
	public void setBlocked(boolean blocked){
		this.blocked = blocked;
	}

}
