import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MesoInherit {

	private MesoStation stationID;
	
	public MesoInherit(MesoStation mesoStation) {
		this.stationID = mesoStation;
	}

	public void read(String filename) throws IOException {
		
		 BufferedReader br = new BufferedReader(new FileReader(filename));
	       
		 String strg = "";
	        
	     // Throw out headers
	     strg = br.readLine();
	     strg = br.readLine();
	     strg = br.readLine();
	     strg = br.readLine();
	     
	     //Read the characters 4 - 7 in.to the HammingArray
	     while (strg != null) {
	    	HammingArray[numStations] = strg.substring(4, 8);
	    
	    	numStations++;
	    	
	    	strg = br.readLine();
	    	
	    	if (numStations >= HammingArray.length) {
	    		expandArray();
	    	}
	     }
	    
	     br.close();
	}
	
	public String[] calAverage() {
		
		int[] asciiVal = new int[4];
		double asciiAvg = 0.0;
		
		for (int i = 0; i < 4; i++) {
			asciiVal[i] = (int) stationID.toString().charAt(i);
		}
		
		asciiAvg = (asciiVal[0] + asciiVal[1] + asciiVal[2] + asciiVal[3]) / 4;
		
		calAverage()[0] = Double.toString(Math.ceil(asciiAvg));
		
		calAverage()[1] = Double.toString(Math.floor(asciiAvg));
		
		calAverage()[2] = Double.toString(Math.round(asciiAvg));
		
		return null;
	}

	public String letterAverage() {
		
		return null;
	}

}
