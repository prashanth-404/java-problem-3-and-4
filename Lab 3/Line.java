

import java.util.ArrayList;

public class Line{
	
	public Point start;
	public Point end;
	
	public Line(Point p1,Point p2){
		this.start = p1;
		this.end = p2;
	}
	
	public Point getstart() {
		return start;
	}
	
	public Point getend(){
		return end;
	}
	
	public void setstart(Point p1) {
		start = p1;
	}
	
	public void setend(Point p2) {
		end = p2;
	}
	
	public double length(){
		return start.getDistance(end);
	}
	
	public static double totalLength(ArrayList<Line> lines){
		
		double total = 0;
        for(Line i:lines){
			total += i.length();
		}
		return total;

	}
	
}
