import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MesoInherit extends MesoAbstract {

	private MesoStation stationID;
	private String StringStation;
	protected String[] stationArray = new String[10];
	protected int numStations = 0;

	
	public MesoInherit(MesoStation mesoStation) {
		this.stationID = mesoStation;
		PosAvg temp = new PosAvg();
		word[] = temp.getArray();
		
	}

	public String[] getStationArray() {
		
		return stationArray;
		
	}
	
	public int[] calAverage() {
		int[] calAvg = new int[3];
		int[] asciiVal = new int[4];
		double asciiAvg = 0.0;
		
		for (int i = 0; i < 4; i++) {
			asciiVal[i] = (int) stationID.toString().charAt(i);
		}
		
		asciiAvg = (asciiVal[0] + asciiVal[1] + asciiVal[2] + asciiVal[3]) / 4;
		
		calAvg[0] = (int) Math.ceil(asciiAvg);
		
		calAvg[1] = (int) Math.floor(asciiAvg);
		
		calAvg[2] = (int) Math.round(asciiAvg);
		
		return calAvg;
	}

	public String letterAverage() {
		
		char letterVal = (char) calAverage()[2];
		String resultLetter = Character.toString(letterVal);
		
		return resultLetter.toUpperCase();
	}
	
	protected MesoInherit() {
		// TODO Auto-generated constructor stub
	}

}
