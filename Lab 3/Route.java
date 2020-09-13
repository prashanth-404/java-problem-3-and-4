

import java.util.ArrayList;

public class Route{
	

	public ArrayList<Road> roads;
	public ArrayList<Integer> swapindex = new ArrayList<Integer>();
	public static String ans;
	
	public Route(ArrayList<Road> roadlist){
		roads = roadlist;
	}
	
	
	public double getWidth() {
		double minWidth = Double.MAX_VALUE;
		for(Road i:roads) {
			if(i.rWidth < minWidth) {
				minWidth = i.rWidth;
			}
		}
		return minWidth;
	}
	
	public double getLength(){
		if(isConnected(roads)){
		    ArrayList<Line> linesgo = new ArrayList<Line>();
		    double lengthOfPath;
		    for(Road i: roads){
			    linesgo.add(i.roadline);
		    }
	
		    lengthOfPath = Line.totalLength(linesgo);
		    return lengthOfPath;
		}
		else{
			return 0.00;
		}
	}
	
	public boolean isConnected(ArrayList<Road> rodes){
		
		double tempx = rodes.get(0).roadline.start.xCoor;
		double tempy = rodes.get(0).roadline.start.yCoor;
		
		String tempo;
		double tempor_x;
		double tempor_y;
		
		for(Road i:rodes){
			
			if(i.roadline.start.xCoor == tempx && i.roadline.start.yCoor == tempy){
				
				//System.out.println("  1  ");
			
		        tempx = i.roadline.end.xCoor;
			    tempy = i.roadline.end.yCoor;
			    swapindex.add(0);
			}
			
			else if(i.roadline.end.xCoor == tempx && i.roadline.end.yCoor == tempy) {
				
				//System.out.println("  2  ");
				
				//System.out.print(i.starting.locName);
				//System.out.println(i.ending.locName);
				
                tempo = i.starting.getloc();
                i.starting.setloc(i.ending.getloc());
                i.ending.setloc(tempo);
                
                tempor_x = i.starting.getCoorx();
                i.starting.setCoorx(i.ending.getCoorx());
                i.ending.setCoorx(tempor_x);
		        
                tempor_y = i.starting.getCoory();
                i.starting.setCoory(i.ending.getCoory());
                i.ending.setCoory(tempor_y);
                
		        //System.out.print(i.starting.locName);
				//System.out.println(i.ending.locName);
				
				tempx = i.roadline.end.xCoor;
			    tempy = i.roadline.end.yCoor;
				swapindex.add(1);
			}
			
			else{
				return false;
			}
			
		}
		
		return true;
		
	}
	
}
