import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PosAvg {
	
	private String StringStation;
	protected String[] stationArray = new String[10];
	protected int numStations = 0;
	//protected ArrayList<String> 
	
	protected String stationID = "";
	private int index;
	
	public PosAvg() {
		
		try {
			read("Mesonet.txt");
		} catch (IOException e) {
			System.out.println("error printing from file");
			e.printStackTrace();
		}
	
	}
	
	public PosAvg(String stID) {
		
		this.stationID = stID;
		
		try {
			read("Mesonet.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//this.index = indexOfStation();
		//toString();
		
	}
	
	public int indexOfStation() {
		
		for (int i = 0; i < numStations; i++) {
			if (stationID.equals(stationArray[i])) {
				index = i;
			}
		}
		
		return index + 1;
	}
	
	public String toString() {
		//index = index - 3;
		this.index = indexOfStation() - 1;
		String indexBefore = stationArray[index - 1];
		String indexAfter = stationArray[index + 1];
		String indexBeforeBefore = stationArray[index - 2];
		String indexAfterAfter = stationArray[index + 2];
		
		return String.format("This index is average of %s and %s, %s and %s, and so on.", 
				indexBefore, indexAfter, indexBeforeBefore, indexAfterAfter);
	
		//return "This index is average of " + indexBefore + " and " + indexAfter + ", " + indexBeforeBefore + " and " + indexAfterAfter + ", and so on.";
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

	public String[] getArray() {
		
		return stationArray;
	}
	
}
