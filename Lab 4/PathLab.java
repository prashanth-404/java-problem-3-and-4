package javafile;

import java.util.ArrayList;

public class PathLab extends Lab {
	
    private static int id_pl = 1;
    ArrayList<LabTest> pathtests = new ArrayList<LabTest>();
	
    public String result_dec() {
    	if(id_pl % 3 == 1 || id_pl % 3 == 2) {
    		return "benign";
    	}
    	else {
    		return "malignant";
    	}
    }
    
	void addTest(PathTest test) {   
		test.set_testId("P" + Integer.toString(id_pl));        // generates testId, the report, 
		test.setResult(result_dec());                         // and then sends it to Dispatch using processReport
		test.setPrice(1000);
		Lab5.getDispatch().processReport(test);
		pathtests.add(test);
		id_pl++;
	}
	public int getpathtests() {
		return pathtests.size();
	}

}
