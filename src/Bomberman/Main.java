package Bomberman;


public class Main {
	
	public boolean isRunning;
	
	GUI gui;
	TileMap map;
	Renderer renderer;
	InputManager inputManager;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main().initialize();
		
	}
	
	private void initialize(){
		gui = new GUI();
		inputManager = new InputManager(gui.input);
		ImageLoader.loadImages();
		map = new TileMap(this,"testmapB");
		renderer = new Renderer();
		isRunning=true;
		gameLoop();
	}
	
	
	
	private void gameLoop(){
		int goalFPS = 60;
		long maxsleep = 1000/goalFPS;
		long runTime;
		long startTime = System.currentTimeMillis();
		
		//test
		renderer.renderTileMap(map);
		
		while(isRunning){
			runTime = System.currentTimeMillis() - startTime;
			startTime = System.currentTimeMillis();
			
			//System.out.println(runTime);

			//send input commands
			inputManager.sendCommands();
			//update game
			map.updateSprites();
			
			//gui.showFrame(renderer.renderTileMap(map));
			//render frame
			gui.showFrame(renderer.renderFrame(map));
			
			if(runTime < maxsleep){
				try{
					Thread.sleep(maxsleep-runTime);
				} catch (InterruptedException e){
					System.err.println(e);
				}
			}
				

		}
	}

}
