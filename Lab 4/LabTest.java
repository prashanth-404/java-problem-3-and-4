package javafile;

public class LabTest {
	
	String patient_id;
	String test_id;
	int Price;
	String Result;
	public LabTest(String patientId) {
		this.patient_id = patientId;
	}                                               // note that this should never get called explicitly
	
	String getPatientId() { return patient_id; }
	String gettestId() { return test_id; }
	int getPrice() { return Price; }
	String getResult() { return Result; }
	
	
	void setPatientId(String id) {
		patient_id = id;
	}
	
	void set_testId(String y) {
		test_id = y;
	}
	
	void setPrice(int p) {
		Price = p;
	}
	
	void setResult(String res) {
		Result = res;
	}
	
}
