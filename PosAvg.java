
public class PosAvg extends MesoInherit {
	
	private String stationID = "";
	private int index = 0;
	
	public PosAvg(String stID) {
		super();
		this.stationID = stID;
		
		//toString();
		
	}

	public int indexOfStation() {
		
	int i = 0;
		
		while (i < numStations) {
			if (stationID.equals(stationArray[i])) {
				index = i + 1;
			}
		}
		
		return index;
	}

	public String toString() {
		
	return "return this shit b";	
	//	return String.format("This index is average of %s and %s, %s and %s, and so on.", 
	//			args);
		
	}
	
}
