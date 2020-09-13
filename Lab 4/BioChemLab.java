package javafile;

import java.util.ArrayList;

public class BioChemLab extends Lab {
	
    private static int id_bc = 1;
    ArrayList<LabTest> biotests = new ArrayList<LabTest>();
	void addTest(BioChemTest test) {   
		test.set_testId("B" + Integer.toString(id_bc));              // generates testId, the report, 
		test.setResult(Integer.toString(id_bc + 99));                // and then sends it to Dispatch using processReport
		test.setPrice(400);
		Lab5.getDispatch().processReport(test);
		biotests.add(test);
		id_bc++;
	}
	public int getbiotests() {
		return biotests.size();
	}

}
