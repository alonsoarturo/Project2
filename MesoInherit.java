import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MesoInherit extends MesoAbstract {

	protected MesoStation stationID;
	private String StringStation;
	protected String[] stationArray;
	protected int numStations = 0;
	private int index = 0;
	
	public MesoInherit(MesoStation mesoStation) {
		
		this.stationID = mesoStation;
		PosAvg temp = new PosAvg();
		stationArray = temp.getArray();
		
	}

	public String[] getStationArray() {
		
		return stationArray;
		
	}

	public char letterAverage() {
		
		char letterVal = (char) calAverage()[2];
		String resultLetter = Character.toString(letterVal);
		resultLetter = resultLetter.toUpperCase();
		char charVal = resultLetter.charAt(0);
		
		return charVal;

}

	public int[] calAverage() {
		int[] calAvg = new int[3];
		double[] asciiVal = new double[4];
		double asciiAvg = 0.0;
		String stationName = stationID.getStID();
		
		for (int i = 0; i < 4; i++) {
			asciiVal[i] = (double) stationName.charAt(i);
		}
		
		asciiAvg = (asciiVal[0] + asciiVal[1] + asciiVal[2] + asciiVal[3]) / 4.0;
		
		calAvg[0] = (int) Math.ceil(asciiAvg);
		
		calAvg[1] = (int) Math.floor(asciiAvg);
		
		calAvg[2] = (int) Math.round(asciiAvg);
		
		return calAvg;
	}
	
}