import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MesoInherit extends MesoAbstract {

	private MesoStation stationID;
	private String StringStation;
	protected String[] stationArray;
	protected int numStations = 0;

	
	public MesoInherit(MesoStation mesoStation) {
		
		this.stationID = mesoStation;
		PosAvg temp = new PosAvg();
		stationArray = temp.getArray();
		
	}

	public String[] getStationArray() {
		
		return stationArray;
		
	}
	
	protected MesoInherit() {
		// TODO Auto-generated constructor stub
	}

	public char letterAverage() {
		
		char letterVal = (char) calAverage()[2];
		String resultLetter = Character.toString(letterVal);
		resultLetter = resultLetter.toUpperCase();
		char charVal = resultLetter.charAt(0);
		
		return charVal;

}

	public int[] calAverage() {
		
		double[] asciiVal = new double[4];
		double asciiAvg = 0.0;
		
		for (int i = 0; i < 4; i++) {
			asciiVal[i] = (double) stationID.toString().charAt(i);
		}
		
		asciiAvg = (asciiVal[0] + asciiVal[1] + asciiVal[2] + asciiVal[3]) / 4.0;
		
		calAverage()[0] = (int) Math.ceil(asciiAvg);
		
		calAverage()[1] = (int) Math.floor(asciiAvg);
		
		calAverage()[2] = (int) Math.round(asciiAvg);
		
		return calAverage();
	}
}