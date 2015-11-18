package fr.iutvalence.info.dut.m3105.labyrinthGame;

public abstract class RobotArtificialIntelligence 
{
	/**
	 * callback method used to get the action the robot wish to perform
	 */
	public abstract Action getAction();

	/**
	 * callback method used to notify scan result (if robot last action type was SCAN)
	 */
	public abstract void notifyScanResult(int distancesToWallsInEachDirection);

	/**
	 * callback method used  to notify move result (if robot last action type was MOVE_FORWARD)
	 */
	public abstract void notifyMoveResult(boolean hasMoved);
	
	
	public static RobotArtificialIntelligence makeRAI(String robot){
		
		switch(robot){
			case "DBAI":{
				DumbBotArtificialIntelligence DBAI = new DumbBotArtificialIntelligence();
				return DBAI;
			}
			case "LDBAI":{
				LesserDumbBotArtificialIntelligence LDBAI = new LesserDumbBotArtificialIntelligence();
				return LDBAI;
			}
				
		}
		return null;
	}
	
}