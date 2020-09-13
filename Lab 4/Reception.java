package javafile;

public class Reception {
	
	private static int id = 1;
	
    public int idAssign() {                               // used to assign unique ids to tests
		return id++;
	}
	
	void addRequest(String testType) { 
		                                                   // should create the appropriate sub-type of LabTest,
		if(testType.equals("Bio")) {
		    
			Lab5.getBill().billTest(400);
			BioChemTest	test = new BioChemTest(String.valueOf(idAssign()));
			Lab5.getBioChem().addTest(test);
		}
		
		if(testType.equals("Path")) {           // add that to Billing and 
		
			Lab5.getBill().billTest(1000);
			PathTest test = new PathTest(String.valueOf(idAssign()));
			Lab5.getPathLab().addTest(test);
		}                                      // then to the specific lab, after generating a patient ID
		
	}
}
