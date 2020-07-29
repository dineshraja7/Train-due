package Train;
import java.util.Scanner;
import java.util.ArrayList;
public class TrainSchedule{
	public static void main(String[] args){
		ArrayList trainList = new ArrayList<Train>();
		ArrayList stopList = new ArrayList<String>();
		
		
		Train mumbaiExpress = new Train();
		mumbaiExpress.initialize(123,"Mumbai Express","Chennai","Mumbai","06:00 AM","10:AM");
		stopList.add("Vijayawada Junction");
		stopList.add("Pune Junction");
		stopList.add("Wadi junction");
		stopList.add("Solapur junction");
		mumbaiExpress.addStop(stopList);
		trainList.add(mumbaiExpress);
		stopList.clear();
		
		Train maduraiExpress = new Train();
		maduraiExpress.initialize(456,"Madurai Express","Kovilpatti","Madurai","07:00 AM","10:29 AM");
		stopList.add("Sattur Junction");
		stopList.add("Virudhunagar Junction");
		stopList.add("Thiruparangundram Junction");
		maduraiExpress.addStop(stopList);
		trainList.add(maduraiExpress);
		stopList.clear();
		
		
		Train nagercoilExpress = new Train();
		nagercoilExpress.initialize(678,"Nagercoil Express","Virudhunagar","Nagercoil","08:00 AM","12:00 PM");
		stopList.add("Sattur Junction");
		stopList.add("Kovilpatti Junction");
		stopList.add("Kayathar  Junction");
		stopList.add("Tirunelveli Junction");
		stopList.add("Salaiputhur Junction");
		stopList.add("AralvaiMozhi Junction");
		nagercoilExpress.addStop(stopList);
		trainList.add(nagercoilExpress);
		stopList.clear();
		
		
		Train vaigaiExpress = new Train();
		vaigaiExpress.initialize(246,"Vaigai Express","Madurai","Trichy","09:00 AM","1:00 AM");
		stopList.add("Thiruparangundram Junction");
		stopList.add("Kallupatti Junction");
		stopList.add("Melamadai Junction");
		stopList.add("Tiruchirapalli junction");
		vaigaiExpress.addStop(stopList);
		stopList.add(vaigaiExpress);
		stopList.clear();
		
		System.out.println("Please enter your destination----->");
		Scanner trainScanner = new Scanner(System.in);
		String dest = trainScanner.next();
		
		for(int i = 0;i<trainList.size();i++){
			Train currentTrain = (Train)trainList.get(i);
			if(currentTrain.destination.equalsIgnoreCase(dest)){
				currentTrain.print();
			}
		}
		
		}
}