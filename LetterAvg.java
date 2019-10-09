import java.util.ArrayList;

public class LetterAvg extends PosAvg {

	private ArrayList<String> sameLetterArray = new ArrayList<String>();
	private char letter;

	
	public LetterAvg(char letterAverage) {
		this.letter = letterAverage;
	}

	public int numberOfStationWithLetterAvg() {
		
		int stationsWithSameLetter = 0;
		
		for (int i = 0; i < numStations; i++) {
			if (stationArray[i].charAt(0) == letter) {
				++stationsWithSameLetter;
				sameLetterArray.add(stationArray[i]);
			}
		}
		return stationsWithSameLetter;
	}

	public String toString() {
		
		String returnString = "\nThey are:";
		
		for (int i = 0; i < sameLetterArray.size(); i++) {
			returnString += "\n" + sameLetterArray.get(i);
		}
		
		return returnString;
	}
}
