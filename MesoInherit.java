import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MesoInherit extends MesoAbstract {

	private MesoStation stationID;
	protected String[] stationArray = new String[10];
	protected int numStations = 0;
	
	public MesoInherit(MesoStation mesoStation) {
		this.stationID = mesoStation;
		
		try {
			read("Mesonet.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	    	stationArray[numStations] = strg.substring(4, 8);
	    
	    	numStations++;
	    	
	    	strg = br.readLine();
	    	
	    	if (numStations >= stationArray.length) {
	    		expandArray();
	    	}
	     }
	    
	     br.close();
	}
	
	public void expandArray() {
   	 
	    int newNumStations = numStations * 2;
	    String[] temp = new String[newNumStations];
	         
	    for(int i = 0; i < stationArray.length; i++) {
	         	temp[i] = stationArray[i];
	         }
	    
	    stationArray = temp;
	    
	}
	
	public int[] calAverage() {
		
		int[] asciiVal = {0, 0, 0, };//new int[4];
		double asciiAvg = 0.0;
		
	//	for (int i = 0; i < 4; i++) {
	//		asciiVal[i] = (int) stationID.toString().charAt(i);
	//	}
		
	//	asciiAvg = (asciiVal[0] + asciiVal[1] + asciiVal[2] + asciiVal[3]) / 4;
		
	//	calAverage()[0] = (int) Math.ceil(asciiAvg);
		
	//	calAverage()[1] = (int) Math.floor(asciiAvg);
		
	//	calAverage()[2] = (int) Math.round(asciiAvg);
		
		return asciiVal;
	}

	public String letterAverage() {
		
		return null;
	}

}
