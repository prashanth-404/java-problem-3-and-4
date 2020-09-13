

public class Location{
	
	public String locName;
	public Point coordinates = new Point(0.00,0.00);
	
	public Location(double xcor, double ycor, String name){
		this.locName = name;
		this.coordinates.setXcoor(xcor);
		this.coordinates.setYcoor(ycor);
	}
	
	public String getloc() {
		return locName;
	}
	
	public double getCoorx() {
		return coordinates.getXcoor();
	}
	
	public double getCoory() {
		return coordinates.getYcoor();
	}
	
	public void setloc(String loc) {
		locName = loc;
	}
	
	public void setCoorx(double x) {
		coordinates.xCoor = x;
	}
	
	public void setCoory(double y) {
		coordinates.yCoor = y;
	}
	
}