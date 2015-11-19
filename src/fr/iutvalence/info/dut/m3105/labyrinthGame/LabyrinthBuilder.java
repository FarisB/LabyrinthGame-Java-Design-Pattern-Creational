package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.Set;

public class LabyrinthBuilder {
	
	private int width;

	private int height;

	private  Position exitPosition;

	private  Set<Position> forbiddenCellsPositions;

	public LabyrinthBuilder width(int width){
		
		this.width=width;
		return this;
	}
	
	
	public LabyrinthBuilder height(int height){
	
		this.height=height;
		return this;
	}
	
	public LabyrinthBuilder position(Position position){
	
		this.exitPosition=position;
		return this;
	}
	
	public LabyrinthBuilder addForbiddenCellsPositions(Position forbiddenCellsPositions){
		
		this.forbiddenCellsPositions.add(forbiddenCellsPositions);
		return this;
	}
	
	public Labyrinth getLabyrinth(){
		Labyrinth lab = new Labyrinth(this.width,this.height,this.forbiddenCellsPositions,this.exitPosition);
		return lab;
	}
	
	public void setWidth(int width){
		this.width=width;
	}
		
	public void setHeight(int height){
		this.height=height;
	}

}
