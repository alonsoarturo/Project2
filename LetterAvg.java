import java.util.ArrayList;

public class LetterAvg extends PosAvg {

	private ArrayList<String> sameLetterArray;
	private char letter;

	
	public LetterAvg(char letterAverage) {
		this.letter = letterAverage;
		
		toString();
	}

	public int numberOfStationWithLetterAvg() {
		
		int stationsWithSameLetter = 0;
		
		for (int i = 0; i < numStations; i++) {
			if (stationArray[i].charAt(0) == letter) {
				++stationsWithSameLetter;
			}
		}
		return stationsWithSameLetter;
	}

	public ArrayList<String> getValues() {
		
		ArrayList<String> returnArray = new ArrayList<String>();
		for (int i = 0; i < numStations; i++) {
			if (stationArray[i].charAt(0) == letter) {
				returnArray.add(stationArray[i]);
			}
		}
		return returnArray;
	}
	
	public String toString() {
		ArrayList<String> temp = getValues();
		//numberOfStationWithLetterAvg();
		
		String returnString = "\nThey are:";
		
		for (int i = 0; i < temp.size(); i++) {
			returnString += "\n" + temp.get(i);
		}
		
		return returnString;
	}
}
