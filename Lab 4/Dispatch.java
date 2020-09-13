package javafile;

import java.util.ArrayList;

public class Dispatch {
	
	ArrayList<String> tests_on = new ArrayList<String>();
	
	void processReport(LabTest test) {
		//System.out.println(test.getPatientId() + test.gettestId() + test.getResult());
		tests_on.add(test.getPatientId() +" "+ test.gettestId()+" " + test.getResult());
	}                                                                                      // called by individual labs 
	ArrayList<String> getAllResults() { 
		return tests_on;
	}
	
}