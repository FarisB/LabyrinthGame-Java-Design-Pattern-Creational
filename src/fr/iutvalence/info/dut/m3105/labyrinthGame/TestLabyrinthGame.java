package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.HashSet;
import java.util.Set;

/**
 * Test application for labyrinth game
 * 
 */
public class TestLabyrinthGame
{
	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (none expected here)
	 */
	public static void main(String[] args)
	{
		Set<Position> blockPositions = new HashSet<Position>();
		blockPositions.add(new Position(2,0));
		blockPositions.add(new Position(3,0));
		blockPositions.add(new Position(0,1));
		blockPositions.add(new Position(0,2));
		blockPositions.add(new Position(1,2));
		blockPositions.add(new Position(3,2));
		blockPositions.add(new Position(3,3));
		Position pos = new Position(2, 3);
		Position exitPos = new Position(2, 2);
		

		new LabyrinthGame(new LabyrinthBuilder().width(5).height(5).addForbiddenCellsPositions(pos).position(exitPos).getLabyrinth(), RobotArtificialIntelligence.makeRAI("DBAI")).play();
	}
}
