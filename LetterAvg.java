
public class LetterAvg extends MesoInherit {

	String letter = "";
	
	public LetterAvg(String letterAverage) {
		this.letter = letterAverage;
	}

	public int numberOfStationWithLetterAvg() {
		int stationsWithSameLetter = 0;
		
		for (int i = 0; i < numStations; i++) {
			if (stationArray[i].equals(letter)) {
				++stationsWithSameLetter;
			}
		}
		return stationsWithSameLetter;
	}

}
