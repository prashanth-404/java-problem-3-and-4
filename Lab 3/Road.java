

public class Road{

    public String rName;
	public double rWidth;
	public Line roadline;
	public Location starting;
	public Location ending;
	
	public Road(Location a, Location b, String name, double width){
	    
		this.rName = name;
		this.rWidth = width;
		this.starting = a;
		this.ending = b;
		this.roadline = new Line(a.coordinates, b.coordinates);
		
	}

	public String getName() {
		return rName;
	}
	
	public void setName(String x) {
		rName = x;
	}
	
	public void setWidth(double w) {
		rWidth = w;
	}
	
	public double getWidth() {
		return rWidth;
	}
	
}