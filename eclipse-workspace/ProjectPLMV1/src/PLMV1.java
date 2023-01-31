import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * @author FSUP
 * @since 31/01/2023
 * @param
 * @return
 * 
 * 
 * Si HashMap pour piece pas possible go for List/ access with index: %1 name, %2 category, %3 price
 * Si marche, afficher que la clé (nom de la pièce) dans les données de l'avion, les autres données pouvant être recup via le nom. SEEMS OK
 */


public class PLMV1 {
		public static final String[] ACProgram = {"ACProgram","A320","A400M","A380","A350"};
//													0			1		2		3		4		
		public static final String[] ACType = {"ACType","cargo", "passenger", "military", "business aircraft"};
//												0			1		2			3			4			5
		public static final String[] ACActualPhase = {"ACActualPhase","feasibility study", "design",
//														0				1						2
														"definition", "construction","in service","closed"};
//															3				4				5			6
		public static final HashMap<String,List<String>> pieces = new HashMap<>();//name(key),0category,1price
		
		
		
		
		
		public static void main(String[] args) {
		/*---------VARIABLES------------*/
		int userChoice=0;
		
		HashMap<Integer,List<String>> planes = new HashMap<>();// id; program0, type1, actual phase2, List?<pieces>3, ... 
		
		Scanner scan = new Scanner(System.in);
		/*---------PGM------------*/
		///////////init///////////
		///////////pieces///////////
		pieces.put("cockpit", new ArrayList<String>());
		pieces.get("cockpit").add("BigPart");//cat
		pieces.get("cockpit").add("Few $");//price
		
		pieces.put("front wheels", new ArrayList<String>());
		pieces.get("front wheels").add("BigPart");//cat
		pieces.get("front wheels").add("Few $");//price
		
		pieces.put("rear wheels", new ArrayList<String>());
		pieces.get("rear wheels").add("BigPart");//cat
		pieces.get("rear wheels").add("Few $");//price
		
		pieces.put("left wing", new ArrayList<String>());
		pieces.get("left wing").add("BigPart");//cat
		pieces.get("left wing").add("Few $");//price
		
		pieces.put("right wing", new ArrayList<String>());
		pieces.get("right wing").add("BigPart");//cat
		pieces.get("right wing").add("Few $");//price
		
		///////////planes///////////
		planes.put(0, new ArrayList<String>());
		planes.put(1, new ArrayList<String>());
		planes.put(2, new ArrayList<String>());
		
		planes.get(0).add(ACProgram[1]);//A320
		planes.get(0).add(ACType[2]);//passenger
		planes.get(0).add(ACActualPhase[4]);//construction
		planes.get(0).add("cockpit");//construction
		
		planes.get(1).add(ACProgram[2]);//A400M
		planes.get(1).add(ACType[3]);//military
		planes.get(1).add(ACActualPhase[3]);//definition
		
		planes.get(2).add(ACProgram[3]);//A380
		planes.get(2).add(ACType[2]);//passenger
		planes.get(2).add(ACActualPhase[5]);//in service
		///////////end init///////////
		
		//System.out.println(planes);
		
		//System.out.println(userChoice);
//		planes.forEach(
//				(key,value)
//				-> System.out.println(key + " = " + value));//FONCTIONNE
		while(userChoice!=5) {
			System.out.println();
			System.out.println();
			userChoice = displayMenuAndGetChoice(scan);
			switch (userChoice) {
			case 1 : displayAllPlanes(planes);
				break;
			case 2 : System.out.println("----case2----");
				break;
			case 3 : System.out.println("----case3----");
				break;
			case 4 : System.out.println("----case4----");
				break;
			case 5 : System.out.println("----case5----");
				break;
			}
		}
		scan.close();
		}
		
		/*---displayMenuAndGetChoice---*/
		public static int displayMenuAndGetChoice(Scanner sc) {
			int choice=0;
			System.out.println("Welcome in PLM Airbus");
			System.out.println("1 : Display all planes. \n2 : Display all planes for certain key word\n 3 : Add or suppr one piece on a plane");
			System.out.println("4 : Display one plane with his pieces details\n5 : Quit the application");
			//do{
				choice=sc.nextInt();
				
			//}while(sc.hasNextInt()==false);
			return choice;
		}
		
		/*---display all items from an HashMap---*/
		/*---"https://www.geeksforgeeks.org/how-to-iterate-hashmap-in-java/" for lot of way to display an HashMap---*/
		public static void displayAllPlanes(HashMap<Integer,List<String>> map) {// OUIIIIIIIIIIIIIIIIIIIIIIII
			map.forEach(
					(key,value)
					-> System.out.println(key + " = " + value));
		}
		/*---display all items from an HashMap---*/
		/*--- 2nd display way---*/
//		public static void displayAllPlanes(HashMap<Integer,List<String>> map) {// OK
//			for (HashMap.Entry<Integer, List<String>> set : 
//				 map.entrySet()) {
//				System.out.println(set.getKey() + " = " + set.getValue());
//			}
//		}
		
		///////////2///////////
		/*---search In ACProgram---*/
		public static void SearchAC(HashMap<Integer,List<String>> map, Scanner sc) {// IN PROGRESS

		}
		///////////2///////////
		
		///////////5///////////
		//La methode 'void' prend en 'args' un id d'avion
		
		//afficher pour l'avion donné: id prog phase type puis
		//extraire le nom des pièces (List3&->end)
		//et afficher leurs nom avec les infos cat + price
		///////////5///////////
}
