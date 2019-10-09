
public class LetterAvg extends PosAvg {

	char letter;
	
	public LetterAvg(char letterAverage) {
		this.letter = letterAverage;
	}

	public int numberOfStationWithLetterAvg() {
		
		int stationsWithSameLetter = 0;
		String[] sameLetterArray = new String[10];
		
		for (int i = 0; i < numStations; i++) {
			if (Character.toString(stationArray[i].charAt(0)).equals(letter)) {
				++stationsWithSameLetter;
			
			}
		}
		return stationsWithSameLetter;
	}

	public String toString() {
		return "\nThey are:\nYeehaw\nyeet"; //String.format("" );
	}
}
