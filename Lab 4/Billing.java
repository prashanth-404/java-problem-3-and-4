package javafile;

class Billing {
	
	int total = 0;
	void billTest(int test) {
		total += test;
	}  // called by Reception
	int getTotal() {
		return total;
	}
}