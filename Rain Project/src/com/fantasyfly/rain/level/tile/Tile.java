package com.fantasyfly.rain.level.tile;

import com.fantasyfly.rain.graphics.Screen;
import com.fantasyfly.rain.graphics.Sprite;
import com.fantasyfly.rain.level.tile.spawn_level.SpawnFloorTile;
import com.fantasyfly.rain.level.tile.spawn_level.SpawnGrassTile;
import com.fantasyfly.rain.level.tile.spawn_level.SpawnHedgeTile;
import com.fantasyfly.rain.level.tile.spawn_level.SpawnWallTile;
import com.fantasyfly.rain.level.tile.spawn_level.SpawnWaterTile;

public class Tile { // Tile class renders a specific tile, it's a template class
	
	public int x, y; 
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass); // static means it cannot be changed
	public static Tile flower = new FlowerTile(Sprite.flower);
	public static Tile rock = new RockTile(Sprite.rock);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	
	public static Tile spawn_grass = new SpawnGrassTile(Sprite.spawn_grass);
	public static Tile spawn_hedge = new SpawnHedgeTile(Sprite.spawn_hedge);
	public static Tile spawn_water = new SpawnWaterTile(Sprite.spawn_water);
	public static Tile spawn_wall1 = new SpawnWallTile(Sprite.spawn_wall1);
	public static Tile spawn_wall2 = new SpawnWallTile(Sprite.spawn_wall2);
	public static Tile spawn_floor = new SpawnFloorTile(Sprite.spawn_floor);
	
	public final static int col_spawn_grass = 0xff00ff00;
	public final static int col_spawn_hedge = 0; //unused
	public final static int col_spawn_water = 0; //unused
	public final static int col_spawn_wall1 = 0xff808080;
	public final static int col_spawn_wall2 = 0xff000000;
	public final static int col_spawn_floor = 0xff7f0000;
	
	public Tile(Sprite sprite) { // each tile has a sprite
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
	}
	
	public boolean solid() { //need to be override, otherwise it's false
		return false;
	}

}
