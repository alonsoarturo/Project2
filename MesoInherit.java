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
		stationArray = temp.getArray();
		
	}

	public String[] getStationArray() {
		
		return stationArray;
		
	}
	
	
	
	protected MesoInherit() {
		// TODO Auto-generated constructor stub
	}

	public String letterAverage() {
		
		char letterVal = (char) calAverage()[2];
		String resultLetter = Character.toString(letterVal);
		
		return resultLetter.toUpperCase();

}

	@Override
	int[] calAverage() {
		// TODO Auto-generated method stub
		return null;
	}
}