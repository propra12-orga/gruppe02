package Bomberman;

import java.util.Iterator;

import javax.swing.ImageIcon;

public abstract class Sprite {
	
	protected ImageIcon image;
	protected int tile_posX;
	protected int tile_posY;
	
	protected int posX;
	protected int posY;
	
	TileMap map;
	
	Sprite(TileMap map, int tile_posX, int tile_posY){
		this.map = map;
		this.tile_posX = tile_posX;
		this.tile_posY = tile_posY;
	}
	
	
	public void setImage(ImageIcon image){
		this.image = image;
	}
	
	public ImageIcon getImage(){
		return image;
	}
	
	public int get_posX(){
		return posX;
	}
	
	public int get_posY(){
		return posY;
	}
	
	public void destroy(){
		map.sprites.remove(this);
	}
	
	//TODO getTilePosX, getTilePosY
	//abstract public void getTilePosX();
	
	//abstract public void getTilePosY();
	
	abstract public void update();

}
