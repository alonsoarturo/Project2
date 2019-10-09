import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {
	
	private String stationID = "";
	private int index = 0;
	private ArrayList <String> sameAvgArray = new ArrayList();
	
	public PosAvg() {
		
	}
	
	public PosAvg(String stID) {
		
		this.stationID = stID;
		
		try {
			read("Mesonet.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		toString();
		
	}
	

	public int indexOfStation() {
		
	int i = 0;
		
		while (i < numStations) {
			if (stationID.equals(stationArray[i])) {
				index = i;
			}
		}
		
		return index + 1;
	}

	public String toString() {
		return null;
		
	//return String.format("This index is average of %s and %s, %s and %s, and so on.", 
		//	stationArray[index - 1], stationArray[index + 1], stationArray[index - 2], stationArray[index + 2]);
	
	
	}
	
	public void read(String filename) throws IOException {
		
		 BufferedReader br = new BufferedReader(new FileReader(filename));
	       
		 String strg = "";
	        
	     // Throw out headers
	     strg = br.readLine();
	     strg = br.readLine();
	     strg = br.readLine();
	     strg = br.readLine();
	    
	     
	     //Read the characters 1 - 5 in.to the HammingArray
	     while (strg != null) {
	    	stationArray[numStations] = strg.substring(1, 5);
	    
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
	
	
}
