

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String args[]){
		
		double xcor,ycor,width;
		int str_index;
		int end_index;
		int road_index;
		String name_loc,name_road;
		
		ArrayList<Location> loc_list = new ArrayList<Location>();
		ArrayList<Road> road_list = new ArrayList<Road>();
		ArrayList<Road> road_list_temp = new ArrayList<Road>();
		ArrayList<Route> route_list = new ArrayList<Route>();
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0;i<n;i++){
			
			xcor = s.nextInt();
			ycor = s.nextInt();
			name_loc = s.next();
			loc_list.add(new Location(xcor,ycor,name_loc));
		}
		
		int m = s.nextInt();
		
		for(int j = 0;j < m;j++){
			
			str_index = s.nextInt();
			end_index = s.nextInt();
			name_road = s.next();
			width = s.nextInt();
			road_list.add(new Road(loc_list.get(str_index),loc_list.get(end_index),name_road,width));

		}
		
		int p = s.nextInt();
		
		for(int k = 0;k < p;k++){
			
			int a = s.nextInt();
			for(int h = 0;h < a;h++){
				road_index = s.nextInt();
			    road_list_temp.add(road_list.get(road_index));
			}
			route_list.add(new Route(road_list_temp));
			road_list_temp = new ArrayList<Road>();
		}
		
		
		s.close();
		
		for(int index = 0;index < p;index++){
			
			System.out.print("Route " + (index + 1) + ": ");
			if(route_list.get(index).getLength()>0){
			    System.out.print("Length ");
			    System.out.format("%.2f",route_list.get(index).getLength());
			    System.out.print(",");
			}
			if(route_list.get(index).getLength()<=0){
				System.out.print("Invalid route");
				System.out.println("");
				continue;
			}
			if(route_list.get(index).getLength()>0) {
				System.out.print(" max width ");
				System.out.format("%.2f", route_list.get(index).getWidth());
				System.out.print(": ");
				
				System.out.print("Start at " + route_list.get(index).roads.get(0).starting.locName + ".");
				
				for(int parse = 0;parse < route_list.get(index).roads.size();parse++){
					if(route_list.get(index).swapindex.get(parse) == 0) {
						System.out.print(" Follow " + route_list.get(index).roads.get(parse).rName +" to " + route_list.get(index).roads.get(parse).ending.locName + ".");
					}
					else {
						System.out.print(" Follow " + route_list.get(index).roads.get(parse).rName +" to " + route_list.get(index).roads.get(parse).starting.locName + ".");
					}
				}
				System.out.println("");
				//System.out.format("double : %.2f", input);
			}
		}
	
	}
}