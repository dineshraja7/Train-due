package Train;
import java.util.ArrayList;
public class Train{
	int trainNo;
	String trainName;
	String startingLocation;
	String destination;
	String startingTime;
	String arrivalTime;
	ArrayList stopList = new ArrayList<String>();
	




public void initialize(int trNo,String trName,String strtngLoc,String arvlLoc,String strtTim, String arvlTim){
	this.trainNo = trNo;
	this.trainName = trName;
	this.startingLocation = strtngLoc;
	this.destination = arvlLoc;
	this.startingTime = strtTim;
	this.arrivalTime = arvlTim;
	
	}
	
	
	
	
public void print(){
	System.out.println("Train name:--->"+trainName);
	System.out.println("Train No:"+trainNo);
	System.out.println("Train Departure----->"+startingLocation);
	System.out.println("Train Destination---->"+destination);
	System.out.println("Time of departure--->"+startingTime);
	System.out.println("Time of Arrival at destination"+arrivalTime);
    
     for(int i = 0;i<stopList.size();i++){
		 System.out.println("This train stops at",stopList.get(i));
	 }	
}


public void addStop(ArrayList stpList){
	stopList.addAll(stopList);
	
}


}
