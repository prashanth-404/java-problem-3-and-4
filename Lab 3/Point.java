

import java.lang.Math; 

public class Point{
	
	public double xCoor;
	public double yCoor;
	
	public Point(double x,double y){
		this.xCoor = x;
		this.yCoor = y;
	}
	
	public void setXcoor(double xNew){
		xCoor = xNew;
	}
	
	public void setYcoor(double yNew){
		yCoor = yNew;
	}
	
	public double getXcoor(){
		return xCoor;
	}
	
	public double getYcoor(){
		return yCoor;
	}
	
	public double getDistance(Point p){
		return Math.sqrt( (xCoor - p.xCoor)*(xCoor - p.xCoor) + (yCoor - p.yCoor)*(yCoor - p.yCoor) );
	}
	
}
